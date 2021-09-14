package StateDesign;

public class Gambol implements State{
    private  State state;
    private State hasCoinState,noCoinState,soldState,soldOutState;
    private int count =0;
    Gambol(int count){
        if(count > 0){
            state = new SoldState(this);
        }else {
            state = new SoldOutState(this);
        }
        hasCoinState = new HasCoin(this);
        noCoinState = new NoCoin(this);
        soldState = new SoldState(this);
        soldOutState= new SoldOutState(this);
    }


    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count){
        this.count = count;
    }

    @Override
    public void insertCoin() {
        state.insertCoin();
    }

    @Override
    public void ejectCoin() {
      state.ejectCoin();
    }

    @Override
    public void turnCrack() {
      state.turnCrack();
    }

    @Override
    public void dispense() {
      state.dispense();
    }
}
