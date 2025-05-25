package TestQuiz.Weekely01;

import java.util.Scanner;

class MemberCash extends JavaStudySelection01 {

    static int pointCash;

    public static void calcPrice(int price) {
        int point = (int)(price * 0.10);
        point = (point / 100) * 100;
        if (point > 300) {
            point = 300; // 포인트 최대 300원까지
        }
        pointCash = point;
    }
}

public class JavaStudySelection01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[캐시백 계산]");

        System.out.print("결제 금액을 입력해주세요. (금액) : ");
        String cashInput = scanner.nextLine();
        int amount = Integer.parseInt(cashInput);

        MemberCash.calcPrice(amount); // 캐시백 계산

        System.out.print("결제 금액은 " + cashInput + "원이고, 캐시백은 " + MemberCash.pointCash+ "원 입니다.");

    }
}
