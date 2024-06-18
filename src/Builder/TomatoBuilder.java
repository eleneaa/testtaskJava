package Builder;

public interface TomatoBuilder {
    TomatoBuilder setTomatoVariety(String tomatoVariety);
    TomatoBuilder setWeight(double weight);
    TomatoBuilder setColor(String color);

    Tomato build();
}
