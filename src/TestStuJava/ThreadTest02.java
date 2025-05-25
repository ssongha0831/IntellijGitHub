package TestStuJava;

class RianThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("리안이 말해요 ( " + i + " )");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

class HayeonThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("하연이 말해요 ( " + i + " )");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }

    }
}

public class ThreadTest02 {
    public static void main(String[] args) {
        RianThread rian = new RianThread();
        HayeonThread hayeon = new HayeonThread();

        rian.start();
        try {
            rian.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hayeon.start();

    }
}
