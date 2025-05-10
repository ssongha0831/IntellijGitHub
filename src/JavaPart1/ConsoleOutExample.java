package JavaPart1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleOutExample {
    public static void referInputStram() throws IOException {
        /*
        // System.in
        System.out.println("=== System.in ==="); // 하나의 숫자만 입력 받을 수 있음
        System.out.print("입력: ");
        int a = System.in.read() - '0';
        System.out.println("a = " + a);
        System.in.read(new byte[System.in.available()]); // 이 부분이 없으면 엔터키가? 남아서 아래 구문에 영향을 미친다.
                                                         // ( Systeam.in에서는 꼭 사용, 남아있는 데이터 소진하는 것 )

        // InputStreamReader -> 읽고자 하는 데이터의 수만큼 배열로 값을 지정하여 불러오는 것
        System.out.println("=== InputStreamReader ===");
        InputStreamReader reader = new InputStreamReader(System.in);
        char[] c = new char[3]; // 배열 사이즈를 3으로 지정하여 3개까지 입력 받을 수 있음
        System.out.print("입력: ");
        reader.read(c);
        System.out.println(c);
        */

        // BufferedReader -> InputStreamReader 처럼 값을 배열로 지정하지 않아도 원하는 만큼 불러 올 수 있음
        System.out.println("=== BufferedReader ===");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("입력: ");
        String s1 = br.readLine();
        System.out.println("s1 = " + s1);
    }
    public static void main(String[] args) throws IOException {

        // 1. 입력
        // 1-1. 다른 입력 방식 참고
        //referInputStram();

        // 1-2. Scanner
        System.out.println("=== Scanner ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        System.out.println(sc.next());
        sc.nextLine();

        System.out.print("입력2: ");
        System.out.println(sc.nextInt()); // Integer 값만 입력해야함
        sc.nextLine();

        System.out.print("입력3: ");
        System.out.println(sc.nextLine()); // 아무 값이나 출력 가능

        // 참고) 정수, 문자열 변환
        int num = Integer.parseInt("12345");
        String str = Integer.toString(12345);

        // 2. 출력
        System.out.println("=== 출력 ===");
        System.out.println("Hello");
        System.out.println("World!");

        System.out.print("Hello");
        System.out.print("World!");

        System.out.printf("Hello");
        System.out.printf("World!");
        System.out.println();

        String s = "자바";
        int number = 3;

        System.out.println(s + "는 언어 선호도 " + number + "위 입니다.");
        System.out.printf("%s는 언어 선호도 %d위 입니다.\n", s, number); // 서식 문자

        System.out.printf("%d\n", 10); // 정수형 %d
        System.out.printf("%o\n", 10); // 8진수
        System.out.printf("%x\n", 10); // 16진수

        System.out.printf("%f\n", 5.2f); // 실수형

        System.out.printf("%c\n", 'A'); // 문자값
        System.out.printf("%s\n", "안녕하세요"); // 문자열

        System.out.printf("%5d\n", 123); // 5개의 공간에 맞춰서 데이터 출력 -> %-5d : 왼쪽으로 붙어서 값 출력
        System.out.printf("%5d\n", 1234);
        System.out.printf("%5d\n", 12345);

        System.out.printf("%.2f\n", 1.12345123f); // 소수점 두번째 자리까지만 출력

    }
}
