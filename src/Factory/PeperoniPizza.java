package Factory;

public class PeperoniPizza implements Pizza{

    @Override
    public void order() {
        System.out.println("You're order Peperoni pizza" );
    }
}
