package Ch03;

import java.util.Arrays;

public class IfElseExample {

    public static void main(String[] args) {

        /*
        // 1. if-else
        // 1. 합격/불합격 판단
        int score = 85;

        if (score >= 60) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
        
        // 2. 학점 계산
        int grade = 87;

        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else  {
            System.out.println("F");
        }



        // 2. 중첩 조건문
        int score = 85;
        int attendance = 80;

        if (score >= 60) {

            if (attendance >= 75) {
                System.out.println("최종합격");
            } else {
                System.out.println("출석 미달로 불합격");
            }

        } else {
            System.out.println("성적 미달로 불합격");
        }
        */

        // 3. switch
        // 1. 요일별 일정
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("월요일 : 회의");
                break;
            case 2:
                System.out.println("화요일 : 업무");
                break;
            case 3:
                System.out.println("수요일 : 휴식");
                break;
            default:
                System.out.println("다른 요일");
        }

        // 2. 계절 판별
        String month = "January";

        switch (month) {
            case "December" : // 의도적으로 break를 쓰지 않은 경우
            case "January" :
            case "February" :
                System.out.println("겨울");
                break;
            case "March" :
            case "April" :
            case "May" :
                System.out.println("봄");
                break;
        }

        // 문제 : if-else문을 삼항 연산자로 바꿔보세요.
        int score = 50;
        String result = ( score >= 50 ) ? "합격" : "불합격"; // 삼항연산자는 결과 값을 항상 리턴해야함
        System.out.println("합격 유무 = " + result);

        // 문제 정답
        int score2 = 85;

        if (score2 >= 60) {
            System.out.println("합격!");
        } else {
            System.out.println("불합격.");
        }

        String result2 = ( score2 >= 60 ) ? "합격!" : "불합격."; // 삼항연산자는 결과 값을 항상 리턴해야함
        System.out.println("삼항 연산자 : " + result2);


    }
}
