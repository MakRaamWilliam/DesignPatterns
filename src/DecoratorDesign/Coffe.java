package DecoratorDesign;

public class Coffe extends Beverage {

    @Override
    public String getDescription() {
        return "Coffe";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}
