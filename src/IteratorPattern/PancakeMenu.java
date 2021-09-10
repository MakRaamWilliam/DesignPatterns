package IteratorPattern;

import java.util.ArrayList;

public class PancakeMenu implements  Menu{
    ArrayList<MenuItem> menuItem;

    public PancakeMenu(ArrayList<MenuItem> menuItem){
        this.menuItem = menuItem;
    }

    @Override
    public Iterator createIterator() {
        return new PancakeIterator(menuItem);
    }
    public void addItem(String ItemName, double price, boolean vegetrian){
        MenuItem item = new MenuItem(ItemName,price,vegetrian);
        menuItem.add(item);
    }

}
