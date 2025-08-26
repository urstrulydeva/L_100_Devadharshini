package Design_patterns.Structural_Pattern.Decorator_Pattern;

public abstract class HttpClientDecorator implements HttpClient {
    protected final HttpClient next;

    protected HttpClientDecorator(HttpClient next) {
        this.next = next;
    }
}

