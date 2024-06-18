package Strategy;

public class OldAndroidStrategy implements Strategy{
    @Override
    public void charge() {
        System.out.println("Заряжайте micro-usb");
    }
}
