package Design_patterns.Structural_Pattern.Adapter_Pattern;

public class NewWeatherAPI {
    public double fetchTemperatureInF(String city) {
        System.out.println("Fetching temperature from NewWeatherAPI in Fahrenheit...");
        return 86.0; // Fahrenheit (equivalent to 30°C)
    }
}