package StateDesign;

public class mainTest {
    public static void main(String[] args) {
        Gambol gambol = new Gambol(1);
        gambol.insertCoin();
        gambol.ejectCoin();
        gambol.turnCrack();
        gambol.dispense();

        gambol.insertCoin();
        gambol.turnCrack();
        gambol.dispense();

        gambol.insertCoin();
        gambol.turnCrack();
        gambol.dispense();

    }
}
