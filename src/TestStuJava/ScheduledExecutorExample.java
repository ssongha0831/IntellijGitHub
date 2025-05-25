package TestStuJava;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorExample {
    public static void main(String[] args) {

        // 2개의 스레드를 가진 ScheduledThreadPool 생성
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        // 일정 시간 뒤 실행 ( 3초 후 한 번 실행 )
        scheduler.schedule(() -> {
            System.out.println("3초 후 한 번 실행 됨 ( Thread :  " + Thread.currentThread().getName() + ")");
        }, 3, TimeUnit.SECONDS);

        // 일정 주기로 반복 실행 ( 2초 뒤 시작 -> 1초 마다 반복 )
        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("1초마다 반복 실행 중 ( Thread : " + Thread.currentThread().getName() + ")");
        }, 2, 1, TimeUnit.SECONDS);

        // 10초 후 종료 예약 ( 스케줄러 종료용 별도 스레드 )
        Executors.newSingleThreadScheduledExecutor().schedule(() -> {
            System.out.println("10초 후 스케줄러 종료");
            scheduler.shutdown();
        }, 10, TimeUnit.SECONDS);
    }
}
