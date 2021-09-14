package StateDesign;

public class HasCoin implements State{
    private Gambol gambol;
    HasCoin(Gambol gambol){
        this.gambol = gambol;
    }

    @Override
    public void insertCoin() {
      System.out.println("you already inserted one!");
    }

    @Override
    public void ejectCoin() {
      System.out.println("you eject coin");
      gambol.setState(gambol.getNoCoinState());
    }

    @Override
    public void turnCrack() {
        System.out.println("wait for your gambol");
    }

    @Override
    public void dispense() {
       System.out.println("Here is your gambol");
        gambol.setCount(gambol.getCount() -1);
        if(gambol.getCount() > 0)
           gambol.setState(gambol.getNoCoinState());
        else
            gambol.setState(gambol.getSoldOutState());
    }
}
