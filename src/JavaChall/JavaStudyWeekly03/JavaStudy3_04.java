/*
송하연
 */
package JavaChall.JavaStudyWeekly03;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


class Producer extends Thread {
    private final BlockingQueue<Integer> buffer;
    public  Producer(BlockingQueue<Integer> buffer) {
        this.buffer = buffer;
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                buffer.put(i);
                System.out.println("= 생산 : " + i);
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Consumer extends Thread {
    private final BlockingQueue<Integer> buffer;
    public  Consumer(BlockingQueue<Integer> buffer) {
        this.buffer = buffer;
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                int value =buffer.take();
                System.out.println("> 소비 : " + value);
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class JavaStudy3_04 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(3);

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}
