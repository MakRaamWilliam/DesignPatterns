package CommandPattern;

public class TV implements elcDevices{

    @Override
    public void on() {
      System.out.println("Tv on..");
    }

    @Override
    public void off() {
      System.out.println("Tv off..");
    }
}
