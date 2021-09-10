package IteratorPattern;

public class DinnerIterator implements Iterator {
    private MenuItem[] menuItem;
    private int index;

    public DinnerIterator(MenuItem[] menuItem){
        this.menuItem = menuItem;
        index = 0;
    }

    @Override
    public MenuItem next() {
        return menuItem[index++];
    }

    @Override
    public boolean hasNext() {
        return (index < menuItem.length
                && menuItem[index] != null);
    }
}
