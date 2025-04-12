package JavaBasic.Ch04;

public class ArrayExample {

    public static void main(String[] args){

        /*
        // 1. 배열
        // 배열이 없다면
        int score1 =90;
        int score2 =80;
        int score3 =85;
        int score4 =95;

        // 배열 사용시
        //int[] scores = { 90, 80, 85, 95 };

        // 2. 배열 선언과 생성
        // 배열 선언
        //int[] numbers; // []가 자료형 뒤에 있는 형태를 자바에서는 더 권장하는 방법
        //int scores[]; -> C언어 스타일 ( 권장하지 x )

        // 배열생성
        //numbers = new int[5]; // 5개의 정수를 저장 할 수 있는 배열 생성

        // 선언과 생성을 동시에
        int[] ages = new int[3];

        // 선언과 동시에 초기화
        int[] points = { 95, 88, 76,91,85};

        // 3. 배열의 사용
        int[] numbers = new int[5];

        // 값 저장
        numbers[0] = 10;
        numbers[1] = 20;

        // 값 읽기
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        // 배열의 길이
        System.out.println(numbers.length); // 배열에 할당된 공간인 5를 출력

        // 배열은 반복문을 사용해 순회 가능
        int[] scores = { 90, 80, 85, 95 };
        /*
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]); // 0,1,2,3
        }
        /////////

        // for-each 사용
        for (int score : scores){ // scores의 있는 배열이 돌면서 정수 타입에 score의 값이 저장 됨
            System.out.println(score); // score 변수에 배열 i를 넣지 않아도 (scores[i] => 위 방법처럼) 값이 동일함
        }

        // 주의 사항
        int[] arr = new int[1];
        //arr[2] = 3; //ArrayIndexOutOfBoundsException => 오류 ( 배열의 인덱스 범위를 벗어나서 값을 지정하면 나오는 오류

        int[] nullArr;
        //nullArr[0] = 1; // 배열을 초기화 하지 않고 값을 지정하면 오류가 나옴 ( new int[1]; => 초기화 )
        *

        
        // 문제 : 배열과 반복문을 활용한 로또 번호 생성기 만들어보기
        int[] lottoNum = new int[6];

        System.out.print("로또번호 : ");
        for (int i = 0; i < 6; i++) {
            lottoNum[i] = (int)(Math.random() * 45) + 1;

            for (int j = 0; j < i; j++) {
                if(lottoNum[i] == lottoNum[j]){
                    i--;
                    break;
                }
            }
            System.out.print(lottoNum[i] + ", ");
        }
        */

        // 문제 정답
        // 1. 로또 번호를 저장할 배열 생성 ( 6개의 숫자 )
        int[] lotto = new int[6];
        
        // 2. 로또 번호 생성 ( 1~ 45 )
        for (int i = 0; i < 6; i++) {
            // 1 ~ 45 사이의 랜덤한 숫자 생성
            int num = (int)(Math.random() * 45 ) + 1; // Math.random()에 45를 곱하고 1을 더하면 정수가 나옴, (int)는 형변환

            // 중복 검사
            boolean isDuplicated = false;

            // 이미 생성된 번호와 비교
            for (int j = 0; j < i; j++) {
                if (lotto[j] == num) {
                    isDuplicated = true;
                    i--; // 중복이면 이번 회차 다시 실행
                    break;
                }
            }

            // 중복이 아닐 경우에만 배열에 저장
            if (!isDuplicated) {
                lotto[i] = num;
            }
        }

        // 생성된 로또 번호를 출력
        System.out.print("로또 번호 : ");
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }







    }
}
