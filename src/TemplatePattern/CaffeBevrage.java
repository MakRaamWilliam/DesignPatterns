package TemplatePattern;

public abstract class CaffeBevrage {

    public  final void PrepareOrder(){
        BoilWater();
        BrewCup();
        PourInCup();
        addItems();
    }
    public void BoilWater(){
        System.out.println("Water is Bolling..");
    }
    public void PourInCup(){
        System.out.println("Pouring in Cup..");
    }
    public abstract void BrewCup();
    public abstract void addItems();

}
