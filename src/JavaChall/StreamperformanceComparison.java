package JavaChall;

import java.util.List;
import java.util.stream.LongStream;

public class StreamperformanceComparison {
    public static void main(String[] args) {
        List<Long> numbers = LongStream.rangeClosed(1, 100_000_000L)
                .boxed()
                .toList();

        // sequential
        long start = System.currentTimeMillis();
        long sumSequential = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToLong(Long::longValue)
                .sum();
        long end = System.currentTimeMillis();
        System.out.println("sequential : " + sumSequential + ", time : " + (end-start) + "ms");

        start = System.currentTimeMillis();

        long sumParallel = numbers.parallelStream()
                .filter(n -> n % 2 == 0 )
                .mapToLong(Long::longValue)
                .sum();
        end = System.currentTimeMillis();
        System.out.println("parallel : " + sumParallel + ", time : " + (end-start) + "ms");

    }
}
