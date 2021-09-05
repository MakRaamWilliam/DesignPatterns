package Factory;

public class VeggiePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Veggie Pizza is preparing");
    }

    @Override
    public void bake() {
        System.out.println("Veggie Pizza is baking");

    }

    @Override
    public void cut() {
        System.out.println("Veggie Pizza is cutting");

    }

    @Override
    public void box() {
        System.out.println("Veggie Pizza is boxing");

    }
}
