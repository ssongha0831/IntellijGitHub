package TestStuJava;

public class RunnableTest {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("안녕하세요, 리안입니다!");
            }
        };
        runnable.run();

        Runnable runnable1 = () -> System.out.println("안녕하세요, 리안입니다!");
        runnable1.run();

    }
}
