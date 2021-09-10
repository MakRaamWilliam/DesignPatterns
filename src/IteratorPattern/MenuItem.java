package IteratorPattern;

public class MenuItem {
    private String ItemName;
    private double price;
    private boolean vegetrian;

    public MenuItem(String ItemName, double price, boolean vegetrian){
        this.ItemName = ItemName;
        this.price = price;
        this.vegetrian = vegetrian;
    }

    public String getItemName() {
        return ItemName;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetrian() {
        return vegetrian;
    }
}
