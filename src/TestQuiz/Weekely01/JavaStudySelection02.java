package TestQuiz.Weekely01;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class JavaStudySelection02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int currentYear = LocalDate.now().getYear();
        int currentMonth = LocalDate.now().getMonthValue();
        int currentDay = LocalDate.now().getDayOfMonth();

        System.out.println("[주민등록번호 계산]");

        // 출생 년도
        System.out.print("출생연도를 입력해 주세요.(yyyy):");
        int year = 0;
        try {
            year = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("올바른 출생년도를 입력해주세요 ( 2000 ~ 현재년도 )");
            System.exit(0);
        }

        if (year < 2000 || year > LocalDate.now().getYear()) {
            System.out.println("올바른 출생년도를 입력해주세요 ( 2000 ~ 현재년도 )");
            System.exit(0);
        }

        // 출생 월
        System.out.print("출생월을 입력해 주세요.(mm):");
        int month = 0;
        try {
            month = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("올바른 출생월을 입력해주세요 ( 1 ~ 12 )");
            System.exit(0);
        }

        if (month < 1 || month > 12) {
            System.out.println("올바른 출생월을 입력해주세요 (1 ~ 12)");
            System.exit(0);
        }

        if (year == currentYear && month > currentMonth) {
            System.out.println("올바른 출생월을 입력해주세요 (1 ~ " + currentMonth + ")");
            System.exit(0);
        }


        // 출생 일
        System.out.print("출생일을 입력해 주세요.(dd):");
        int day = 0;
        try {
            day = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("올바른 출생일을 입력해주세요 ( 1 ~ 31 )");
            System.exit(0);
        }

        if (day < 1 || day > 31) {
            System.out.println("올바른 출생일을 입력해주세요 (1 ~ 31)");
            System.exit(0);
        }

        if (year == currentYear && month == currentMonth && day > currentDay) {
            System.out.println("올바른 출생일을 입력해주세요 (1 ~ " + currentDay + ")");
            System.exit(0);
        }

        System.out.print("성별을 입력해 주세요.(m/f):");
        char gender = scanner.next().charAt(0);

        String front = String.format("%02d%02d%02d", year % 100, month, day); // 두자리 정수 출력 -> 두 자리가 아니면 0으로 자리채우기

        // 성별
        int genderCode;
        if (gender == 'm' || gender == 'M') {
            genderCode = 3;
        } else if(gender == 'f' || gender == 'F') {
            genderCode = 4;
        } else {
            System.out.println("성별을 잘못 입력하셨습니다.");
            return;
        }

        // 뒷자리 생성
        int randomNum = random.nextInt(999999) + 1;
        String back = String.format("%d%06d", genderCode, randomNum); // 성별을 제외한 6자리 수는 랜덤으로 생성

        System.out.println(front + " - " + back);
    }
}
