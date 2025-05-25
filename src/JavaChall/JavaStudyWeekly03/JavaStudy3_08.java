/*
송하연
 */
package JavaChall.JavaStudyWeekly03;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class JavaStudy3_08 {
    public static void main(String[] args) {
        int amount = 50_000;
        System.out.println("결제 요청 중... (" + amount + "원)" );

        CompletableFuture<String> paymentFuture = CompletableFuture.supplyAsync(()-> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException("결제 중 인터럽트 발생!");
            }
            return "결제 완료 : " + amount + "원";
        });

        try {
            String result = paymentFuture.get(3, TimeUnit.SECONDS);
            System.out.println(result);
        } catch (TimeoutException e) {
            System.out.println("결제 실패 : 시간 초과");
        } catch (ExecutionException e) {
            System.out.println("결제 실패 : " + e.getCause().getMessage());
        } catch (InterruptedException e) {
            System.out.println("결제 실패 : 인터럽트 발색");
        }
    }
}
