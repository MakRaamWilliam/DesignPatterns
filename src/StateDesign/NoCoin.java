package StateDesign;

public class NoCoin implements State{

    private Gambol gambol;
    NoCoin (Gambol gambol){
        this.gambol = gambol;
    }

    @Override
    public void insertCoin() {
        System.out.println("you inserted coin wait for gambol ");
        gambol.setState(gambol.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
      System.out.println("you did not insert coin!");
    }

    @Override
    public void turnCrack() {
     System.out.println("you turn count but no coin");
    }

    @Override
    public void dispense() {
      System.out.println("no coin no gambol");
    }
}
