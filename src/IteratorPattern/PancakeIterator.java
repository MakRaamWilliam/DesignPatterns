package IteratorPattern;

import java.util.ArrayList;

public class PancakeIterator implements Iterator{

   private ArrayList<MenuItem> menuItems;
   private int index;
   public PancakeIterator(ArrayList menuItems){
       this.menuItems = menuItems;
       index =0;
   }

    @Override
    public MenuItem next() {
        return menuItems.get(index++);
    }

    @Override
    public boolean hasNext() {
        return (index < menuItems.size()
                && menuItems.get(index) != null);
    }
}
