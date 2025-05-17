package JavaPart1.Quiz;
/*
    문제 1. 입력된 정수 자료형의 숫자를 거꾸로 변환하는 프로그램을 작성하세요
    - 예를 들어 12345가 입력되면 54321로 변환하여 출력하면 된다.
    - 100의 경우 001이 되는 데 이 경우 1만 출력하도록 한다.
 */

public class Quiz01 {
    public static void solution(int num) {
        int numReverse = 0; // 값을 거꾸로 뒤집어서 넣어줄 변수
        boolean isMinus = false; // 마이너스 일 때 넣어줄 변수

        if (num < 0) {
            isMinus = true; // num이 음수이면 isMinus를 true로 값 변경
            num *= -1; // -1곱해주기
        }

        while (num > 0) {
            int r = num % 10;
            num /= 10;
            numReverse = numReverse * 10 + r;
        }
        System.out.println(isMinus ? numReverse * -1 : numReverse);

    }
    public static void main(String[] args) {
        // Test code
        solution(12345);
        solution(-12345);
        solution(100);
        solution(0);

    }
}
