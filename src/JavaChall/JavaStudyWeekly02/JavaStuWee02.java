package JavaChall.JavaStudyWeekly02;

import java.util.Scanner;

public class JavaStuWee02 {
    public static void main(String[] args) {

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
    }
}
