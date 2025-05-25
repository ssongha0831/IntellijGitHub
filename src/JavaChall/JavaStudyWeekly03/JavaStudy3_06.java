/*
송하연
 */
package JavaChall.JavaStudyWeekly03;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.*;

public class JavaStudy3_06 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable emilTask = new Runnable() {
            int count = 1;
            @Override
            public void run() {
                String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSS"));
                System.out.println("[ " + now + " ]  이메일 발송 : " + count + " ( " + Thread.currentThread().getName() + ")" );
            }
        };

        scheduler.scheduleAtFixedRate(emilTask, 5, 10, TimeUnit.SECONDS);

    }
}
