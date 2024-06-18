package Factory;

public class MargaritaPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new MargaritaPizza();
    }
}
