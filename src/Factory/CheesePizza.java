package Factory;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Cheese Pizza is preparing");
    }

    @Override
    public void bake() {
        System.out.println("Cheese Pizza is baking");

    }

    @Override
    public void cut() {
        System.out.println("Cheese Pizza is cutting");

    }

    @Override
    public void box() {
        System.out.println("Cheese Pizza is boxing");

    }
}
