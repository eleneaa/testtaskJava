package Singletone;

public class Main {
    public static void main(String[] args){
        Singletone singletone = Singletone.getInstance("pupapupa");
        singletone.test();

        Singletone singletone2 = Singletone.getInstance("shlupapupa");
        singletone2.test();
    }
}
