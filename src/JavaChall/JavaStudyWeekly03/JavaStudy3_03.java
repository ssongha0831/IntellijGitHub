// 36기 송하연
package JavaChall.JavaStudyWeekly03;

class ThreadDownloadFile implements Runnable {
    volatile boolean suspended = false;
    volatile boolean stopped = false;

    @Override
    public void run() {
        while (!stopped) {
            if (!suspended) {
                System.out.println(Thread.currentThread().getName() + " 다운로드 시작...");

                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) { }
                System.out.println(Thread.currentThread().getName() + " 다운로드 완료!");
                break;
            }
        }
    }
}

public class JavaStudy3_03 {
    public static void main(String[] args) {

        ThreadDownloadFile thDown1 = new ThreadDownloadFile();
        ThreadDownloadFile thDown2 = new ThreadDownloadFile();
        ThreadDownloadFile thDown3 = new ThreadDownloadFile();

        Thread file1 = new Thread(thDown1, "파일_1.zip");
        Thread file2 = new Thread(thDown2, "파일_2.mp4");
        Thread file3 = new Thread(thDown3, "파일_3.pdf");

        file1.start();
        file2.start();
        file3.start();
    }
}
