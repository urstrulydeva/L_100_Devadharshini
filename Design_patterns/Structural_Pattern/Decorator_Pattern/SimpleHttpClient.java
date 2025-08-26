package Design_patterns.Structural_Pattern.Decorator_Pattern;

public class SimpleHttpClient implements HttpClient {
    @Override
    public String get(String url) {
        // Imagine a real HTTP call here.
        return "200 OK from " + url;
    }
}

