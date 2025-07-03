package TestQuiz;

class Calculator {
    public void calculate() {
        int num1 = 10;
        int num2 = 5;
        char operator = '*';

        class Operation {
            void printInfo() {
                int result = 0;

                switch (operator) {
                    case '+' :
                        result = num1 + num2;
                        break;
                    case '-' :
                        result = num1 - num2;
                        break;
                    case '*' :
                        result = num1 * num2;
                        break;
                    case '/' :
                        result = num1 / num2;
                        break;
                }

                System.out.println("[계산기 시작]");
                System.out.println("첫 번째 숫자 : " + num1);
                System.out.println("두 번째 숫자 : " + num2);
                System.out.println("연산자 선택 (+, -, *, /) : " + operator);
                System.out.println();
                System.out.println("결과 " + num1 + " " + operator + " " + num2 + " = " + result );
            }

        }

        Operation operation = new Operation();
        operation.printInfo();
    }


}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate();
    }
}
