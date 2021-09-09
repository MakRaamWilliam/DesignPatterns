package TemplatePattern;

public class Tea extends CaffeBevrage{
    @Override
    public void BrewCup() {
        System.out.println("Brew the Tea");
    }

    @Override
    public void addItems() {
      System.out.println("adding Lemon");
    }
}
