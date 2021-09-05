package DecoratorDesign;

public class MainClass {
    public static void main(String[] args) {
        Beverage espresso = new Coffe();
        System.out.println(espresso.getDescription() + " Cost: " + espresso.getCost() + "$");

        Beverage espressoMilk = new Milk(espresso);
        System.out.println(espressoMilk.getDescription() + " Cost: " + espressoMilk.getCost() + "$");

        espresso = new Mocha(espresso);
        System.out.println(espresso.getDescription() + " Cost: " + espresso.getCost() + "$");

    }
}
