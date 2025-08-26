package Design_patterns.Structural_Pattern.Decorator_Pattern;

public class LoggingClient extends HttpClientDecorator {

    public LoggingClient(HttpClient next) {
        super(next);
    }

    @Override
    public String get(String url) {
        System.out.println("[LOG] GET " + url);
        try {
            String res = next.get(url);
            System.out.println("[LOG] <- " + res);
            return res;
        } catch (RuntimeException e) {
            System.out.println("[LOG] !! error: " + e.getMessage());
            throw e;
        }
    }
}

