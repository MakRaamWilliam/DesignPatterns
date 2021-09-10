package IteratorPattern;

public class DinnerMenu implements  Menu{
    private final int MaxSize = 6;
    MenuItem[] menuItem;
    private int index;
    public DinnerMenu(MenuItem [] menuItem){
        this.menuItem = menuItem;
        index =0;
    }

    @Override
    public Iterator createIterator() {
        return new DinnerIterator(menuItem);
    }
    public void addItem(String ItemName, double price, boolean vegetrian){
        if (index >= MaxSize){
            System.out.println("Menu is full");
        }else {
            MenuItem item = new MenuItem(ItemName, price, vegetrian);
            menuItem[index++] = item;
        }
    }


}
