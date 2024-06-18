package Singletone;

public class Singletone {
    private static Singletone instance;

    private String data;

    private Singletone(String data){
        this.data = data;
    }

    public void test(){
        System.out.println(data);
    }

    public static Singletone getInstance(String data){
        if (instance == null){
            instance = new Singletone(data);
        }
        return instance;
    }
}
