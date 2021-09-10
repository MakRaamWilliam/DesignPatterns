package IteratorPattern;

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {

        ArrayList<MenuItem> pancakeArr = new ArrayList<>();
        pancakeArr.add(new MenuItem("Cake",25.0,true));
        pancakeArr.add(new MenuItem("Milk",12.0,true));
        pancakeArr.add(new MenuItem("Coffe",10.0,false));

        PancakeMenu pancakeMenu = new PancakeMenu(pancakeArr);
        MenuItem [] dinnerItems = new  MenuItem[5];
        dinnerItems[0] = new MenuItem("Soup",25.0,false);
        dinnerItems[1] = new MenuItem("Meal",30.0,true);
        dinnerItems[2] = new MenuItem("Tea",8.0,false);

        DinnerMenu dinnerMenu = new DinnerMenu(dinnerItems);

        Waiter waiter = new Waiter(dinnerMenu,pancakeMenu);
        waiter.printMenu();

    }

}
