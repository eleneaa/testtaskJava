package Strategy;

public class Main {

    public static void main (String[] args){

        Phone iphonX = new Iphon();
        Phone xiaomiMi11Lite = new Android();
        Phone nokia3310 = new OldAndroid();

        iphonX.charge();
        xiaomiMi11Lite.charge();
        nokia3310.charge();
    }
}
