package Factory;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PeperoniPizzaFactory();
        Pizza pizza = pizzaFactory.createPizza();

        pizza.order();
    }
}