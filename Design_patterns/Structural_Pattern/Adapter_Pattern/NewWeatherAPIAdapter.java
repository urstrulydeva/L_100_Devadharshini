package Design_patterns.Structural_Pattern.Adapter_Pattern;

class NewWeatherAPIAdapter implements WeatherService {
    private NewWeatherAPI newApi;

    public NewWeatherAPIAdapter(NewWeatherAPI newApi) {
        this.newApi = newApi;
    }

    @Override
    public double getTemperature(String city) {
        double tempF = newApi.fetchTemperatureInF(city);
        // Convert Fahrenheit -> Celsius
        return (tempF - 32) * 5 / 9;
    }
}
