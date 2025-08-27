package Design_patterns.Behavourial_Pattern.Iterator_Pattern;


import java.util.List;

public class Page<T> {
    public final List<T> items;
    public final String nextPageToken;

    public Page(List<T> items, String nextPageToken) {
        this.items = items;
        this.nextPageToken = nextPageToken;
    }
}

