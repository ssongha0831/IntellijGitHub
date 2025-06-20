package TestStuJava;

record User(String name, int age) { }

public class RecordExample {
    public static void main(String[] args) {
        User user = new User("하연", 30);
        System.out.println(user.name());
        System.out.println(user.age());
    }
}
