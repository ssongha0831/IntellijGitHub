/*
송하연
 */
package TestQuiz.Weekely02;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaStudySelection02_01 {
    public static void main(String[] args) throws Exception { // 조건식 다시 수정하고 예외처리 추가하기
        final int PRICE = 10000;
        final int FREE = 0;
        final int SPECIAL_PRICE = 4000;
        final int NORMAL_PRICE = 8000;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("[입장권 계산]");

        int age = 0;
        int time = 0;
        String veteran = "";
        String welfareCard = "";
        boolean isVeteran = false;
        boolean hasWelfareCard = false;

        try {
            System.out.print("나이를 입력해 주세요.(숫자) : ");
            age = scanner.nextInt();

            System.out.print("입장시간을 입력해 주세요.(숫자입력) : ");
            time = scanner.nextInt();

            while (true) {
                System.out.print("국가유공자 여부를 입력해 주세요.(y/n) : ");
                veteran = scanner.next();
                String answer = veteran.toLowerCase();
                if (answer.equals("y")) {
                    isVeteran = true;
                    break;
                } else if (answer.equals("n")) {
                    isVeteran = false;
                    break;
                } else {
                    System.out.println("잘못된 입력입니다. y또는 n만 입력해 주세요.");
                }
            }

            while (true) {
                System.out.print("복지카드 여부를 입력해 주세요.(y/n) : ");
                welfareCard = scanner.next();
                String answer = welfareCard.toLowerCase();
                if (answer.equals("y")) {
                    hasWelfareCard = true;
                    break;
                } else if (answer.equals("n")) {
                    hasWelfareCard = false;
                    break;
                } else {
                    System.out.println("잘못된 입력입니다. y또는 n만 입력해 주세요.");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다. 숫자를 입력해 주세요.");
            return;
        }

        int price = PRICE;

        if (age < 3) {
            price = FREE;
        } else {
            // 일반 할인
            int normalDiscount = (isVeteran == true) || (hasWelfareCard == true) ? NORMAL_PRICE : PRICE;
            // 13세 미만 특별할인
            int specialDiscount1 = (age < 13) ? SPECIAL_PRICE : PRICE;
            // 17시 이후 특별할인
            int specialDiscount2 = (time >= 17) ? SPECIAL_PRICE : PRICE;

            price = Math.min(normalDiscount, Math.min(specialDiscount1, specialDiscount2));
        }

        System.out.println("입장료 : " + price);
    }
}
