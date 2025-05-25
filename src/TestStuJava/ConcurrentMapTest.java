package TestStuJava;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapTest {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        Runnable task1 = () -> {
            for (int i = 0; i < 1000; i++) {
                map.put("A" + i, i);
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 1000; i++) {
                map.put("B" + i, i);
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("총 key 개수 : " + map.size());
    }
}
