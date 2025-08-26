package Design_patterns.Structural_Pattern.Decorator_Pattern;

import java.time.Duration;
import java.time.Instant;

public class MetricsClient extends HttpClientDecorator {

    public MetricsClient(HttpClient next) {
        super(next);
    }

    @Override
    public String get(String url) {
        Instant start = Instant.now();
        try {
            return next.get(url);
        } finally {
            long ms = Duration.between(start, Instant.now()).toMillis();
            System.out.println("[METRICS] latency_ms=" + ms);
        }
    }
}

