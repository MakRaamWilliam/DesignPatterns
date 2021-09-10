package IteratorPattern;

public class Waiter {
    private Menu DinnerMenu, PancakeMenu;

    public Waiter(DinnerMenu dinnerMenu, PancakeMenu pancakeMenu){
        this.DinnerMenu = dinnerMenu;
        this.PancakeMenu = pancakeMenu;
    }

    public void printMenu(){
        Iterator PancakeIterator = PancakeMenu.createIterator();
        System.out.println("BreakFast Menu ---------");
        printMenuIterator(PancakeIterator);
        Iterator DinnerIterator = DinnerMenu.createIterator();
        System.out.println("Dinner Menu ------------");
        printMenuIterator(DinnerIterator);
    }

    private void printMenuIterator(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem item =  iterator.next();
            System.out.print("Name: "+ item.getItemName() + ",");
            System.out.print("Price: "+ item.getPrice() + ",");
            System.out.println("Isvegeterian: "+ item.isVegetrian() + ",");
        }
    }
}
