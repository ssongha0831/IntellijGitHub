/*
송하연
 */
package JavaChall.JavaStudyWeekly03;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

class SumTask extends RecursiveTask<Long> {
    private static final int THRESHOLD = 500_000_000;
    private long[] numbers;
    private int start, end;

    public SumTask(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    protected Long compute() {
        if (end - start <= THRESHOLD) {
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += numbers[i];
            }
            return  sum;
        }

        int mid = start + ( end - start ) / 2;
        SumTask leftTask = new SumTask(numbers, start, mid);
        SumTask rightTask = new SumTask(numbers, mid, end);

        leftTask.fork();
        long rightResult = rightTask.compute();
        long leftResult = leftTask.join();

        return leftResult + rightResult;
    }
}

public class JavaStudy3_07 {
    public static void main(String[] args) {
        long[] numbers = new long[500_000_000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        long start = System.currentTimeMillis();
        long sumSequential = LongStream.rangeClosed(1, 500_000_000).sum();
        long end = System.currentTimeMillis();
        System.out.println("> 순차 스트림 합계 : " + sumSequential + "( 시간 : " + (end - start) + "ms)");

        start = System.currentTimeMillis();
        long sumParallel = LongStream.rangeClosed(1, 500_000_000).parallel().sum();
        end = System.currentTimeMillis();
        System.out.println("= 병렬 스트림 합계 : " + sumParallel + "( 시간 : " + (end - start) + "ms)");


    }
}
