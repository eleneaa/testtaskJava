package Factory;

public class MargaritaPizza implements Pizza{
    @Override
    public void order() {
        System.out.println("You're order Margarita pizza");
    }
}
