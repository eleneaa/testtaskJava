package Strategy;

public class Phone {

    Strategy strategy;

    public void charge(){
        strategy.charge();
    }

    public void turnOff(){
        System.out.println("Телефон выключился");
    }

    public void turnOn(){
        System.out.println("Телефон включился");
    }
}

