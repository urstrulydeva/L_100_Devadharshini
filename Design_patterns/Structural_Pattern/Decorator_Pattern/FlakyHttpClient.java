package Design_patterns.Structural_Pattern.Decorator_Pattern;

import java.util.concurrent.atomic.AtomicInteger;

public class FlakyHttpClient implements HttpClient {
    private final AtomicInteger failuresLeft = new AtomicInteger(2);

    @Override
    public String get(String url) {
        if (failuresLeft.getAndDecrement() > 0) {
            throw new RuntimeException("Transient 503");
        }
        return "200 OK from " + url;
    }
}

