package CommandPattern;

public class Stereo implements elcDevices{

    public void putCD(){
        System.out.println("Cd is put..");
    }

    @Override
    public void on() {
        System.out.println("Stereo on..");
    }

    @Override
    public void off() {
     System.out.println("Stereo off..");
    }

}
