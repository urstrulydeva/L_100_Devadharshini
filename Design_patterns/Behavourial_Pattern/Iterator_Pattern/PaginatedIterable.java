package Design_patterns.Behavourial_Pattern.Iterator_Pattern;


import java.util.*;

public class PaginatedIterable<T> implements Iterable<T> {
    private final PageFetcher<T> fetcher;

    public PaginatedIterable(PageFetcher<T> fetcher) { this.fetcher = fetcher; }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private List<T> buffer = java.util.Collections.emptyList();
            private int index = 0;
            private String nextToken = null;
            private boolean initialized = false;

            private void ensure() {
                if (!initialized || (index >= buffer.size() && nextToken != null)) {
                    Page<T> page = fetcher.fetch(initialized ? nextToken : null);
                    initialized = true;
                    buffer = page.items;
                    index = 0;
                    nextToken = page.nextPageToken;
                }
            }

            @Override public boolean hasNext() {
                ensure();
                if (index < buffer.size()) return true;
                if (nextToken == null) return false;
                // try to fetch next page if current exhausted
                ensure();
                return index < buffer.size();
            }

            @Override public T next() {
                if (!hasNext()) throw new NoSuchElementException();
                return buffer.get(index++);
            }
        };
    }
}
