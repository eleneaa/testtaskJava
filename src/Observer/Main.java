package Observer;

public class Main {
    public static void main(String[] args){
        var studentDormitory = new StudentDormitory();

        new Tenant("Иван Иванов", studentDormitory);
        new Tenant("Сергей Сергеев", studentDormitory);

        studentDormitory.setNewsChurch("Вас выселяют =(");
    }
}
