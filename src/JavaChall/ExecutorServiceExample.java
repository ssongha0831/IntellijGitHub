package JavaChall;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService exector = Executors.newFixedThreadPool(3); // 3개의 스레드 사용
        for (int i = 0; i <= 5 ; i++) { // 5개 반복
            final int taskId = i;
            exector.execute(() -> {
                System.out.println("작업 " +  taskId + " 실행 (스레드 : " + Thread.currentThread().getName() + ")");
                // 실행 자체는 스케쥴에 따라 달라질 수 있음
                try { Thread.sleep(2000); } catch (InterruptedException e) {}
                System.out.println("작업 " + taskId + " 완료");
            }) ;
        }

        exector.shutdown(); // 모든 작업이 끝난 후 스레드 풀 종료
    }
}
