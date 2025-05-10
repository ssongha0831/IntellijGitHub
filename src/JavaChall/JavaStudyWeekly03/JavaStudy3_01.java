// 36기 송하연
package JavaChall.JavaStudyWeekly03;
import java.util.Scanner;

public class JavaStudy3_01 {
    public static void main(String[] args) {

        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        System.out.println("> Task : ATMSystem.main()");

        while (true) {
            System.out.print("출금할 금액 입력 : ");
            String input = scanner.nextLine().trim();

            try {
                int number = Integer.parseInt(input);

                if (number > account.getAmount()) {
                    throw new MinusException("잔액 부족!\n");
                } else if (number == 0) {
                    throw new ZeroException("금액을 0이상으로 입력해주세요.\n");
                }
                int value = account.getAmount() - number;

                System.out.println("출금 완료! 남은 잔액은 " + value);
                System.out.println("거래 금액이 저장되었습니다.");
                break;
            } catch (NumberFormatException e) {
                System.out.println("숫자가 아닙니다. 올바른 숫자를 입력하세요.");
                System.out.println();
            } catch (MinusException | ZeroException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}

// 잔액 부족
class MinusException extends Exception {
    public MinusException(String message) {
        super(message);
    }
}
// 금액 0
class ZeroException extends Exception {
    public ZeroException(String message) {
        super(message);
    }
}
// 금액 합계


class Account {
    private int amount = 10000;

    public void deposit(int amount) {
        this.amount += amount;
    }
    public Account() {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
}

