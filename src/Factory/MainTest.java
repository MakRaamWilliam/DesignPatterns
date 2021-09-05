package Factory;

public class MainTest {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore order = new PizzaStore(factory);
        order.OrderPizza("Greek");

    }
}
