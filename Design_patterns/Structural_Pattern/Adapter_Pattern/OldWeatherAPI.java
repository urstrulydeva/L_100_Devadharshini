package Design_patterns.Structural_Pattern.Adapter_Pattern;

public class OldWeatherAPI implements WeatherService {
    @Override
    public double getTemperature(String city) {
        // Pretend this is calling the old API
        System.out.println("Fetching temperature from OldWeatherAPI in Celsius...");
        return 30.0; 
    }
}
