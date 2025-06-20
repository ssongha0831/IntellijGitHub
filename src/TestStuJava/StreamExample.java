package TestStuJava;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = List.of("하연", "지민", "수현", "윤");
        List<String> result = names.stream()
                .filter(nameList -> nameList.length() == 2)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
