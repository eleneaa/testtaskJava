package Strategy;

public class Android extends Phone{
    public Android(){
        this.strategy = new AndroidStrategy();
    }
}
