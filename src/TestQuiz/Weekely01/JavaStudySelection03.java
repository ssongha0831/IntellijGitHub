package TestQuiz.Weekely01;

import java.time.LocalDate;
import java.util.Scanner;

public class JavaStudySelection03 {
    public static void Calender(int year, int month){
        int date = 1;
        int day;

        LocalDate dateFirst = LocalDate.of(year, month, date);
        day = dateFirst.getDayOfWeek().getValue();


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[달력 출력 프로그램]");
        System.out.println("달력의 년도를 입력해 주세요(yyyy):");
        int year = scanner.nextInt();

        System.out.println("달력의 월을 입력해 주세요.(mm):");
        int month = scanner.nextInt();

        System.out.println("[" + year + "년 " + month + "월]");


    }
}
