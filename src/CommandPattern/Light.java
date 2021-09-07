package CommandPattern;

public class Light implements elcDevices{
    @Override
    public void on() {
     System.out.println("Light on..");
    }

    @Override
    public void off() {
     System.out.println("Light off..");
    }
}
