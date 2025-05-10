package JavaChall;

class Counter100 {
    private int count1 = 0;
    public void increment() {
        synchronized (this) {
            count1++;
        }
    }
    public int getCount() {
        return count1;
    }
}
public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        Counter100 counter1 = new Counter100();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter1.increment();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter1.increment();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.print("최종 값 : " + counter1.getCount());
    }
}
