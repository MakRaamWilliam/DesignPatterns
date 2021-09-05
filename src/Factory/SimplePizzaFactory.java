package Factory;

public class SimplePizzaFactory {
    private  Pizza pizza;
    public Pizza CreatePizza(String type){
        if (type == "Cheese")
            pizza = new CheesePizza();
        else if(type == "Greek")
            pizza = new GreekPizza();
        else if (type == "Veggie")
            pizza = new VeggiePizza();

        return pizza;
    }
}
