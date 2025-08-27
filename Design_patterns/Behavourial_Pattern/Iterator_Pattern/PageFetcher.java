package Design_patterns.Behavourial_Pattern.Iterator_Pattern;

public interface PageFetcher<T> {
    Page<T> fetch(String pageToken); // pageToken == null for first page
}

