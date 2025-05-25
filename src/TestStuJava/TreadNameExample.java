package TestStuJava;

class RianThreadName extends Thread {
    public void run() {
        this.setName("🌀 리안");
        for (int i = 0; i < 3; i++){
            System.out.println(getName() + " 말해요 ( " + i + " )");
            try { Thread.sleep(500);} catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}
class HayeonThreadName extends Thread {
    public void run() {
        this.setName("🌸 하연");
        for (int i = 0; i < 3; i++){
            System.out.println(getName() + " 말해요 ( " + i + " )");
            try { Thread.sleep(500);} catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

public class TreadNameExample {
    public static void main(String[] args) {
        RianThreadName rian = new RianThreadName();
        HayeonThreadName hayeon = new HayeonThreadName();

        rian.start();
        hayeon.start();
    }
}
