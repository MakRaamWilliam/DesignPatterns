package DecoratorDesign;

public class Tea extends Beverage {

    @Override
    public String getDescription() {
        return "Tea";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
