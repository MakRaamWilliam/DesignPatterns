package StateDesign;

public class SoldOutState implements  State{

    private Gambol gambol;
    SoldOutState(Gambol gambol){
        this.gambol = gambol;
    }

    @Override
    public void insertCoin() {
        System.out.println("sorry no gambols");
    }

    @Override
    public void ejectCoin() {
      System.out.println("no coin inserted ");
    }

    @Override
    public void turnCrack() {
     System.out.println("no coin inseted");
    }

    @Override
    public void dispense() {
       System.out.println("no coin no gambol");
    }
}
