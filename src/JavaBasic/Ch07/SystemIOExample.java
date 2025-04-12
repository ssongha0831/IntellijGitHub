package JavaBasic.Ch07;

import java.io.IOException;
import java.util.Scanner;

public class SystemIOExample {

    public static void main(String[] args) throws IOException {

        /*
        // 1. System.out
        // print 줄바뀜 없이 출력
        int number = 10;
        String text = "자바";
        System.out.print(number);
        System.out.print(text);

        // println 줄바뀜 포함 출력
        System.out.println();
        System.out.println("첫 번째 줄");
        System.out.println("두 번째 줄");

        // printf() 포맷팅 된 출력
        System.out.println();

        String name = "홍길동";
        int age = 20;
        double height = 175.5;

        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("키 : %.1f\n", height);
        /


        // 2. System.in
        // 한 바이트 읽기
        System.out.print("문자(char) 입력 : ");
        int input = System.in.read(); // 콘솔에서 내가 값을 입력받을 수 있음

        //
        System.out.println("입력한 문자 : " + (char) input);
        System.out.println("아스키 코드값 : " + input);
        /

        // 3. Scanner
        // 학생 정보 입력 프로그램 만들기
        Scanner scanner = new Scanner(System.in);

        System.out.println("학생 정보를 입력하세요.");
        System.out.print("이름 : ");
        String name = scanner.nextLine();

        System.out.print("학년 : ");
        int grade = scanner.nextInt();

        scanner.nextLine(); // 버퍼 비우기

        System.out.print("반 : ");
        String className = scanner.nextLine();

        // 입력 정보 출력
        System.out.println("\n== 학생 정보 ==");
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade);
        System.out.println("반 : " + className);

        scanner.close();
        */

        // 4. 계산기 프로그램 개발
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 숫자 입력
        System.out.print("첫 번째 숫자: ");
        int num1 = scanner.nextInt();

        // 연산자 입력
        System.out.print("연산자(+,-,*,/) : ");
        String op = scanner.next();

        // 두 번째 숫자 입력
        System.out.print("두 번째 숫자: ");
        int num2 = scanner.nextInt();

        // 결과 계산 및 출력
        if (op.equals("+")) {
            System.out.println("결과 : " + (num1 + num2));
        } else if (op.equals("-")) {
            System.out.println("결과 : " + (num1 - num2));
        } else if (op.equals("*")) {
            System.out.println("결과 : " + (num1 * num2));
        } else if (op.equals("/")) {

            if (num2 != 0) {
                System.out.println("결과 : " + (num1 / num2));
            } else {
                System.out.println("0으로 나눌 수 없습니다.");
            }
        } else {
            System.out.println("잘못된 연산자입니다.");
        }
        scanner.close();

    }
}
