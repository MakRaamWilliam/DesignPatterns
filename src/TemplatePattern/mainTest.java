package TemplatePattern;

public class mainTest {
    public static void main(String[] args) {
        CaffeBevrage Order = new Tea();
        System.out.println("Order Tea ");
        Order.PrepareOrder();
        System.out.println("Order Coffee");
        Order = new Coffe();
        Order.PrepareOrder();
    }
}
