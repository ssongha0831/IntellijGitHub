package TestQuiz.Weekely01;

import java.util.Scanner;

class MemberCash extends JavaStudySelection01 {

    static int pointCash;
    public int calcPrice;
    public int price;

    public MemberCash() {
        this.pointCash = 0;
    }
    public static void calcPrice(int price) {
        int point = (int)(price * 0.10);
        pointCash += point;

    }
}

public class JavaStudySelection01 {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[캐시백 계산]");

        System.out.print("결제 금액을 입력해주세요. (금액) : ");
        String cashInput = scanner.next();

        MemberCash memberCash = new MemberCash();
        MemberCash.calcPrice(1000); // 10% 적립

        // 금액에 따른 캐시백 변화
        if (memberCash.calcPrice > 300) {
            //Object price;
            //price = cashInput( int price);
            //int point = (int) (this.price * 0.30);
            //emberCash.pointCash += point;
            MemberCash.calcPrice(10000);
            System.out.print("결제 금액은 " + cashInput + "원이고, 캐시백은 " + MemberCash.pointCash+ "원 입니다.");
        }

        System.out.print("결제 금액은 " + cashInput + "원이고, 캐시백은 " + MemberCash.pointCash+ "원 입니다.");
    }
}
