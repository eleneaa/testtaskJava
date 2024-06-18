package Strategy;

public class OldAndroid extends Phone{

    public OldAndroid(){
        this.strategy = new OldAndroidStrategy();
    }

}
