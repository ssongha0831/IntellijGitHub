/*
송하연
 */
package JavaChall.JavaStudyWeekly03;

public class JavaStudy3_05 {
    private static ThreadLocal<String> name = new ThreadLocal<>();

    private static void setThreadLocal() {
        if (name.get() == null) {
            name.set("사용자 B");
        }
    }

    public static void main(String[] args) {

        setThreadLocal();

        name.set("사용자 A");
        System.out.println("Thread-1 로그인 : " + name.get());

        Thread subThread = new Thread(() -> {
            setThreadLocal();
            System.out.println("Thread-2 로그인 : " + name.get());
            name.remove();
        });
        subThread.start();

        name.remove();
    }
}
