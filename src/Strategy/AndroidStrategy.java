package Strategy;

public class AndroidStrategy implements Strategy{
    @Override
    public void charge() {
        System.out.println("Заряжайте type-c");
    }
}
