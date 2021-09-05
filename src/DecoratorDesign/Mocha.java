package DecoratorDesign;

public class Mocha  extends ConDecorator{
   private DecoratorDesign.Beverage beverage;
    public Mocha(DecoratorDesign.Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double getCost() {
        return beverage.getCost() + 3.5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " With Mocha";
    }
}
