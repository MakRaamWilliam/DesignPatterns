package TemplatePattern;

public class Coffe extends CaffeBevrage{
    @Override
    public void BrewCup() {
        System.out.println("Brew Coffe");
    }

    @Override
    public void addItems() {
       System.out.println("adding Milk");
    }
}
