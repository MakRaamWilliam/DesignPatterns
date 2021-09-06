package Observer;

import java.util.ArrayList;

public class WeatherData  implements Subject{
    private float temp, humidity, press;
    private ArrayList observers;

    public WeatherData(){
        observers = new ArrayList();
    }
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void RemoveObserver(Observer observer) {
        if(observers.indexOf(observer) >= 0)
            observers.remove(observer);
    }

    @Override
    public void NotifyObservers() {
        for (int i =0;i<observers.size();++i){
            Observer o = (Observer) observers.get(i);
            o.update(temp,humidity,press);
        }
    }
    public void SetData(float temp, float humidity, float press){
        this.temp = temp;
        this.humidity = humidity;
        this.press = press;
    }
}
