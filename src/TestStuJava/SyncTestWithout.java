package TestStuJava;

class Counter {
    int count = 0;

    public void increment() {
        count++;
    }
}

class CountTread extends Thread {
    Counter counter;

    public CountTread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class SyncTestWithout {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        CountTread t1 = new CountTread(counter);
        CountTread t2 = new CountTread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("최종 count값 : " + counter.count); // 클래스가 아닌 객체이름으로 접근 해야함!!

    }
}
