package Design_patterns.Structural_Pattern.Adapter_Pattern;

public class Main {
    public static void main(String[] args) {
        WeatherService oldService = new OldWeatherAPI();
        System.out.println("Old API Temp: " + oldService.getTemperature("Bangalore") + "°C");

        WeatherService newService = new NewWeatherAPIAdapter(new NewWeatherAPI());
        System.out.println("New API Temp (via Adapter): " + newService.getTemperature("Bangalore") + "°C");
    }
}
