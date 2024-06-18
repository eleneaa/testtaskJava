package Strategy;

public class IphoneStrategy implements Strategy{
    @Override
    public void charge() {
        System.out.println("Заряжайте lightning");
    }
}
