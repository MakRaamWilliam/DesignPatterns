package AdapterDesign;

public class Maintest {
    public static void main(String[] args) {
        Duck mallordDuck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyDuck = new TurkeyAdapter(turkey);

        testDuck(mallordDuck);
        testDuck(turkeyDuck);
    }

    private static void testDuck(Duck duck) {
      duck.quack();
      duck.fly();
    }

}
