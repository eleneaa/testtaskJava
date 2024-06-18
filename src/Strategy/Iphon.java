package Strategy;

public class Iphon extends Phone {

    public Iphon() {

        this.strategy = new IphoneStrategy();
    }
}
