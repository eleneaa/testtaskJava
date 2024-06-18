package Builder;

public class Main {
    public static void main(String[] args) {
        Tomato tomato = new TomatoBuilderImp().setTomatoVariety("Гном").setWeight(80).build();
        tomato.print();
    }
}
