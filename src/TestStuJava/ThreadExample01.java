package TestStuJava;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("리안과 공부 중... (" + i + ")");
            try {
                Thread.sleep(1000); // 1초 쉬기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExample01 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        //thread.start(); // 스레드 시작!
        thread.run();
    }
}
