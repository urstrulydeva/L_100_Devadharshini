package Design_patterns.Structural_Pattern.Decorator_Pattern;

public class Main {
    public static void main(String[] args) {
        // Compose behaviors at runtime; order defines policy:
        HttpClient resilientClient =
            new MetricsClient(
                new LoggingClient(
                    new RetryClient(
                        new FlakyHttpClient(), 3
                    )
                )
            );

        String body = resilientClient.get("https://api.example.com/users");
        System.out.println(body);

        // Swap to a lean client in a perf-sensitive path:
        HttpClient lean = new SimpleHttpClient();
        System.out.println(lean.get("https://api.example.com/health"));
    }
}

