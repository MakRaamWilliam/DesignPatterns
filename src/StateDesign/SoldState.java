package StateDesign;

public class SoldState implements  State{

    private  Gambol gambol;

    SoldState(Gambol gambol){
        this.gambol = gambol;
    }
    @Override
    public void insertCoin() {
      System.out.println("you inseted coin");
      gambol.setState(gambol.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
      System.out.println("no coins");
    }

    @Override
    public void turnCrack() {
        System.out.println("no coin");
    }

    @Override
    public void dispense() {
       System.out.println("no coin no gambol");
    }
}
