package DecoratorDesign;

public class Milk extends ConDecorator{
    private Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double getCost() {
        return beverage.getCost() + 2.5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " With Milk";
    }
}
