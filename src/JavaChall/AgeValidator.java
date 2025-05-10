package JavaChall;
import java.util.Scanner;

class InvalidAgeException2 extends Exception {
    public InvalidAgeException2(String message) {
        super(message);
    }
}
public class AgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력하세요 (종료 : exit)");

        while (true) {
            System.out.print("입력 : ");
            String input = scanner.nextLine().trim();

            if (input.equals("exit")) {
                System.out.println("프로그램 종료");
                break;
            }
            try {
                int age =Integer.parseInt(input);
                validateAge(age);
                System.out.println("유효한 나이입니다 : " + age);
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력하세요.");
            } catch (InvalidAgeException2 e) {
                System.out.println("입력 오류 : " + e.getMessage());
            }
        }
        scanner.close();
    }
    private static void validateAge(int age) throws InvalidAgeException2 {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException2("나이는 0 이상 120 이하만 입력 가능 합니다.");
        }
    }
}
