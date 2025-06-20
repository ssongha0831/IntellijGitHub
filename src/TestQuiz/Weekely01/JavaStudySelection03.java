package TestQuiz.Weekely01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MonthCalendar {
    private int startIndex;
    private int lastDay;
    private int year;
    private int month;
    private String title;
    private String[] lines;

    public MonthCalendar(int year, int month) {
        this.year = year;
        this.month = month;
        this.title = String.format("[%4d년 %2d월]", year, month);
        this.lines = generateCalendarLines();
    }

    private String[] generateCalendarLines() {
        List<String> lines = new ArrayList<>();
        StringBuilder line = new StringBuilder();

        LocalDate dateFirst = LocalDate.of(year, month, 1);
        int startIndex = dateFirst.getDayOfWeek().getValue() % 7;
        int lastDay = dateFirst.lengthOfMonth();

        for (int i = 0; i < startIndex; i++) {
            line.append("   ");
        }

        for (int i = 1; i <= lastDay; i++) {
            line.append(String.format("%02d ", i));
            if ((i + startIndex) % 7 == 0) {
                while (line.length() < 21) line.append(" ");
                lines.add(line.toString());
                line = new StringBuilder();
            }
        }

        if (line.length() > 0) {
            while (line.length() < 21) line.append(" ");
            lines.add(line.toString());
        }

        while (lines.size() < 6) {
            lines.add("                     ");
        }
        return lines.toArray(new String[0]);
    }

    public String getTitle() {
        return title;
    }

    public String[] getLines() {
        return lines;
    }
}

public class JavaStudySelection03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentYear = LocalDate.now().getYear();
        int currentMonth = LocalDate.now().getMonthValue();;

        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요(yyyy): ");
        int year = scanner.nextInt();

        if (year > currentYear) {
            System.out.println("오류 : 현재 년도 (" + currentYear + ")를 초과 할 수 없습니다.");
            return;
        }

        System.out.print("달력의 월을 입력해 주세요.(mm): ");
        int month = scanner.nextInt();

        // 월은 1 ~ 12까지 입력 가능
        if (month < 1 || month > 12) {
            System.out.println("오류 : 월은 1월 ~ 12월 사이여야 합니다.");
            return;
        }

        if (year == currentYear && month > currentMonth) {
            System.out.println("오류 : 현재 " + currentMonth + "월을 초과 할 수 없습니다.");
            return;
        }

        LocalDate date = LocalDate.of(year, month, 1);
        LocalDate prevDate = date.minusMonths(1);
        LocalDate nextDate = date.plusMonths(1);

        MonthCalendar prev = new MonthCalendar(prevDate.getYear(), prevDate.getMonthValue());
        MonthCalendar curr = new MonthCalendar(year, month);
        MonthCalendar next = new MonthCalendar(nextDate.getYear(), nextDate.getMonthValue());

        System.out.printf("%-21s%-21s%-21s\n", prev.getTitle(), curr.getTitle(), next.getTitle());
        System.out.printf("%-20s%-20s%-20s\n", "일 월 화 수 목 금 토", "일 월 화 수 목 금 토", "일 월 화 수 목 금 토");
        for (int i = 0; i < 6; i++) {
            String line1 = prev.getLines()[i];
            String line2 = curr.getLines()[i];
            String line3 = next.getLines()[i];
            System.out.printf("%-22s%-22s%-22s\n", line1, line2, line3);
        }
    }
}
