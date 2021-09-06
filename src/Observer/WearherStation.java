package Observer;

public class WearherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
        weatherData.SetData(30,10,50);
        currentDisplay.update(31,20,70);
    }
}
