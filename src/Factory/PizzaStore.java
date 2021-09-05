package Factory;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }
    public Pizza OrderPizza(String type){
      Pizza pizza = factory.CreatePizza(type);

      pizza.prepare();
      pizza.bake();
      pizza.cut();
      pizza.box();

      return pizza;
    }
}
