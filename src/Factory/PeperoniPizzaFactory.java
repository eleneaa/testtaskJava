package Factory;

public class PeperoniPizzaFactory implements PizzaFactory{

    @Override
    public Pizza createPizza() {
        return new PeperoniPizza();
    }
}
