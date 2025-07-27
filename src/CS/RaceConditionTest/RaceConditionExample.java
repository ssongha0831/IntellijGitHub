/* 송하연*/
package CS.RaceConditionTest;

public class RaceConditionExample {
    static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) count++;
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) count++;
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("최종 count (동기화 X): " + count);
    }
}
