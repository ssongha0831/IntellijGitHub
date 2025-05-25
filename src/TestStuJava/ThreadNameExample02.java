package TestStuJava;
/*
class WorkerThread01 extends Thread {
    public void run() {
        this.setName("작업자-1");
        for (int i = 0; i < 3; i++ ) {
            System.out.println("작업자 확인 : " + getName() +  " - " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

class WorkerThread02 extends Thread {
    public void run() {
        this.setName("작업자-2");
        for (int i = 0; i < 3; i++ ) {
            System.out.println("작업자 확인 : " + getName() +  " - " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}


class WorkerThread03 extends Thread {
    public void run() {
        this.setName("작업자-3");
        for (int i = 0; i < 3; i++ ) {
            System.out.println("작업자 확인 : " + getName() +  " - " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}
*/

class WorkerThread extends Thread {
    public WorkerThread(String name) {
        this.setName(name);
    }

    public void run() {
        for (int i = 0; i <= 3; i++ ) {
            System.out.println(getName() +  " 작업 중... ( " + i + " )");
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

public class ThreadNameExample02 {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            WorkerThread worker = new WorkerThread("작업자-" + i);
            worker.start();
        }
    }
}
