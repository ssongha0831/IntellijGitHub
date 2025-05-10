package JavaChall;

class MyThread100 extends Thread {
    public void run() {
        System.out.println("hello, thead ( 스레드 : " + Thread.currentThread().getName() + ")");
    }
}
class MyThread200 implements Runnable {
    @Override
    public void run() {
        System.out.println("hello, thread (runnable) (스레드 : " + Thread.currentThread().getName() + ")");
    }
}
public class ThreadExample100 {
    public static void main(String[] args) {
        MyThread100 thread101 = new MyThread100();
        MyThread100 thread102 = new MyThread100();
        MyThread100 thread103 = new MyThread100();

        thread101.start();
        thread102.start();
        thread103.run();

        Thread thread201 = new Thread(new MyThread200());
        thread201.start();
    }
}
