package Observer;

public class CurrentDisplay implements Observer, DisplayData {
    private float temp, press;
    private Subject WeatherData;
    public CurrentDisplay(Subject WeatherData){
        this.WeatherData = WeatherData;
        this.WeatherData.addObserver(this);
    }

    @Override
    public void Display() {
        System.out.println("Temperature is :" + temp + "\nPressure is: " + press);
    }

    @Override
    public void update(float temp, float humidity, float press) {
        this.temp = temp;
        this.press =press;
        Display();
    }
}
