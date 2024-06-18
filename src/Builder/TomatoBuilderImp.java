package Builder;

public class TomatoBuilderImp implements TomatoBuilder{
    Tomato tomato = new Tomato();
    @Override
    public TomatoBuilder setTomatoVariety(String tomatoVariety) {
        tomato.tomatoVariety = tomatoVariety;
        return this;
    }

    @Override
    public TomatoBuilder setWeight(double weight) {
        tomato.weight = weight;
        return this;
    }

    @Override
    public TomatoBuilder setColor(String color) {
        tomato.color = color;
        return this;
    }

    @Override
    public Tomato build() {
        return tomato;
    }
}
