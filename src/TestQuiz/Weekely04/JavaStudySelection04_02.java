package TestQuiz.Weekely04;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStudySelection04_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 (공백 또는 쉼표 구분) : ");
        String input = sc.nextLine();

        List<Integer> numbers = Stream.of(input.split("[,\\s]+"))
                .filter(s -> !s.isEmpty())
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("입력된 숫자: " + numbers);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        double avg = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);

        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> odds = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        int max = numbers.stream().mapToInt(Integer::intValue).max().orElse(0);
        int min = numbers.stream().mapToInt(Integer::intValue).min().orElse(0);

        List<Integer> distinctSorted = numbers.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("합계 : " + sum);
        System.out.printf("평균 : %.2f%n", avg);
        System.out.println("짝수 : " + evens);
        System.out.println("홀수 : " + odds);
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
        System.out.println("중복 제거 후 정렬된 숫자 : " + distinctSorted);

        sc.close();
    }
}
