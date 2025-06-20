package TestStuJava;

import java.io.IOException;
import java.util.*;

public class main {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Integer> priceMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("과일 이름을 입력하세요 (종료하려면 'exit' 입력) : ");
            String fruit = scanner.next();

            if (priceMap.containsKey(fruit)) {
                System.out.println("이미 등록된 과일입니다. 가격을 수정하시겠습니까?");
            }

            if (fruit.equals("exit")) break;

            System.out.print("가격을 입력하세요 : ");
            Integer price = null;
            try {
                price = scanner.nextInt();
            } catch (InputMismatchException  e) {
                System.out.println("숫자가 아닙니다. 다시 입력해주세요.");
                scanner.nextInt(); // 버퍼 비우기
            }

            priceMap.put(fruit, price);
            System.out.println();

        }
        System.out.println();
        System.out.println("== 등록된 과일 목록 ==");
        System.out.println(priceMap);

    }
}
