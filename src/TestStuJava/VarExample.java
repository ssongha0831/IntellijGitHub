package TestStuJava;

import java.util.List;

public class VarExample {
    public static void main(String[] args) {
        var name = "하연";
        var age = 30;
        var items = List.of("JAVA", "STREAM", "LAMBDA");

        System.out.println("이름은 " + name + " 나이는 " + age + " 지금 공부중인 것 " +items );
    }
}
