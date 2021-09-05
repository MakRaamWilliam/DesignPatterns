package Factory;

public class GreekPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("Greek Pizza is preparing");
    }

    @Override
    public void bake() {
        System.out.println("Greek Pizza is baking");

    }

    @Override
    public void cut() {
        System.out.println("Greek Pizza is cutting");

    }

    @Override
    public void box() {
        System.out.println("Greek Pizza is boxing");

    }
}
