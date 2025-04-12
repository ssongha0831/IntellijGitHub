package JavaBasic.Ch02;

public class TypeCastingExample {

    public static void main(String[] args){
        /*
        // 1. 정수형 -> 실수형 형변환
        int number = 10;
        double doubleNumber = ( double ) number;
        System.out.println("1. 정수 -> 실수 ");
        System.out.println("number = " + number);
        System.out.println("doubleNumber = " + doubleNumber);

        // 2. 실수형 -> 정수형 형변환
        double score = 93.7;
        int scoreInt = (int) score;
        System.out.println();
        System.out.println("2. 실수 -> 정수 ");
        System.out.println("score = " + score);
        System.out.println("scoreInt = " + scoreInt);

        // 3.논리형
        boolean flag = true;
        System.out.println();
        System.out.println("3. 논리형은 형변환 불가");
        System.out.println("flag = " + flag);

        //int boolToInt = (int) flag; // 에러발생

        // 문제 : int -> char로 서로 형변환하면 어떻게 될까요?

        /* 혼자 해결
        int number2 = 7;
        //char numberChar = (char)(number2 + '0'); -> 이 방법 다시 알아보기!!
        int radix = 10;
        char numberChar = Character.forDigit(number2, radix);
        System.out.println();
        System.out.println("4. 정수 -> 문자 ");
        System.out.println("number2 = " + number2);
        System.out.println("numberChar = " + numberChar);
        *

        // 답
        char ch = 'A';
        int chNUm = (int) ch;

        // 결과
        System.out.println();
        System.out.println("4. 문자 -> 정수");
        System.out.println("ch = " + ch);
        System.out.println("chNUm = " + chNUm); // A에 대한 아스키 코드에 대한 숫자

        int num = 66;
        char character = (char) num; // '66'으로 출력될까?
        System.out.println();
        System.out.println("5. 정수 -> 문자");
        System.out.println("num = " + num);
        System.out.println("character = " + character);

        /* 이렇게 작성했으면 더 편하게 작성할 수 있음 -> 내가 푼 방법 수정
        int number2 = 66;
        char numberChar = (char)(number2);
        System.out.println();
        System.out.println("4. 정수 -> 문자 ");
        System.out.println("number2 = " + number2);
        System.out.println("numberChar = " + numberChar);
        *

        */

        // 1. 업캐스팅 ( 작은타입 -> 큰타입 )
        System.out.println("=== 업캐스팅 ===");
        int number = 10;
        double doubleNumber = number; // int -> double 자동 형변환
        System.out.println("int 값 : " + number); // 10
        System.out.println("doubleNumber 값 : " + doubleNumber); // 10.0

        // 2. 다운캐스팅 ( 큰타입 -> 작은타입 )
        System.out.println();
        System.out.println("=== 다운 캐스팅 ===");
        double score = 93.7;
        int scoreInt = (int) score;
        System.out.println("double 값 : " + score); // 93.7
        System.out.println("int 값 : " + scoreInt); // 93

        System.out.println("=== 데이터 손실 ===");
        double pi = 3.14;
        int intPi = (int) pi;
        System.out.println("double 값 : " + pi); //3.14
        System.out.println("int 값 : " + intPi);

        int a = 333;
        byte b = ( byte) a;
        System.out.println("int = " + a);
        System.out.println("b = " + b);


    }
}
