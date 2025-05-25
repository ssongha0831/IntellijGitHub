package TestStuJava;

class Buffer {
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) {
        while (hasData) {
            try { wait(); } catch (InterruptedException e) {}
        }
        data = value;
        hasData = true;
        System.out.println("생산 : " + data);
        notify(); // 소비자 스레드 깨우기
    }

    public synchronized void consume() {
        while (!hasData) {
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println("소비 : " + data);
        hasData = false;
        notify(); // 생산자 스레드 깨우기
    }
}

class Producer extends Thread {
    private Buffer buffer;

    public Producer(Buffer buffer) { // 생성자
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i); // buffer안에 있는 produce 메소드
            try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}
class Consumer extends Thread {
    private Buffer buffer;

    public Consumer(Buffer buffer){
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume(); // buffer안에 있는 consume 메소드
            try { Thread.sleep(800); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

public class ProducerConsumerTest{
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Producer produccer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        produccer.start();
        consumer.start();
    }
}
