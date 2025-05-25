package TestStuJava;

class CounterBlock {
    int count = 0;

    final Object lock = new Object(); // 락으로 사용할 객체 생성 -> 락 기준점 역할 ( 상수로 선언 )

    public void increment() { // increment() 메서드는 count++ 수행
        synchronized (lock) { // 충돌 방지를 위한 synchronized (lock) 블록 -> 한번에 한 스레드만 이 블록 안에 들어올 수 있음 ( 동시성 방지 )
            count++;
        }
    }
}

class CountThread extends Thread {
    CounterBlock counterBlock; // CounterBlock 타입의 공유 객체를 저장 할 변수 -> 초기화 안한 상태 ( int num; 과 같음 )

    public CountThread(CounterBlock counterBlock) { // 생성자 ( CountThread ) -> 외부에서 공유 객체를 넘겨 받아서 이 클래스 내부 필드에 저장
        this.counterBlock = counterBlock; // this.counterBlock 은 필드 , counterBlock 는 매개변수
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counterBlock.increment(); // increment()를 1000번 호출하여 count++ 1000번 수행
        }
    }
}

public class SyncTestWithBlock {
    public static void main(String[] args) throws InterruptedException {
        CounterBlock counterBlock = new CounterBlock(); // CounterBlock 인스턴스 생성 -> t1, t2 스레드 공유해서 사용

        // 스레드 두개 생성 -> 둘 다 같은 counterBlock 객체를 공유해서 count 증가
        CountThread t1 = new CountThread(counterBlock);
        CountThread t2 = new CountThread(counterBlock);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("최종 count값 : " + counterBlock.count);
    }
}
