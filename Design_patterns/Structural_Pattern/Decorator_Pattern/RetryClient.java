package Design_patterns.Structural_Pattern.Decorator_Pattern;

public class RetryClient extends HttpClientDecorator {
    private final int maxRetries;

    public RetryClient(HttpClient next, int maxRetries) {
        super(next);
        this.maxRetries = maxRetries;
    }

    @Override
    public String get(String url) {
        int attempt = 0;
        while (true) {
            try {
                attempt++;
                return next.get(url);
            } catch (RuntimeException e) {
                if (attempt > maxRetries) throw e;
                System.out.println("[RETRY] attempt " + attempt + " failed: " + e.getMessage());
            }
        }
    }
}

