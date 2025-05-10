package JavaPart1;

import com.sun.tools.javac.Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class NotTenException extends RuntimeException {}

public class ExceptionExample {
    public static boolean checkTen(int ten) {
        if (ten != 10) {
            return false;
        }
        return true;
    }

    public static boolean checkTenWithException(int ten) {

        try {
            if (ten != 10) {
                throw new NotTenException();
            }
        } catch (NotTenException e) {
            System.out.println("e = " + e);
            return false;
        }

        return true;
    }

    public static boolean checkTenWithThrows(int ten) throws NotTenException { // 예외가 생기면 안에서 처리하는 것이 아니라 밖으로 보냄 (함수를 호출 한 쪽에서 예외처리)
        if (ten != 10){
            throw new NotTenException();
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        // 1. 예외
        // 1-1. 0으로 나누기
        System.out.println("=== 0으로 나누기 ===");
        //int a = 5 / 0;

        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누기 예외 발생");
            System.out.println("e = " + e);
        } finally {
            System.out.println("1-1 연습 종료");
        }

        // 1-2. 배열 인덱스 초과
        System.out.println("=== 배열 인덱스 초과 ===");
        int[] b = new int[4];
        //b[4] = 1;

        try {
            b[4] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("e = " + e);
        }

        // 1-3. 없는 파일 열기
        System.out.println("=== 없는 파일 열기 ===");
        //BufferedReader br = new BufferedReader(new FileReader("abc.txt"));

        // 2. throw, throws
        System.out.println("=== checkTen ===");
        boolean checkResult = ExceptionExample.checkTen(10);
        System.out.println("checkResult = " + checkResult);

        System.out.println("=== checkTenWithException ===");
        checkResult = ExceptionExample.checkTenWithException(9);
        System.out.println("checkResult = " + checkResult);
        System.out.println();

        System.out.println("=== checkTenWithThrows ===");
        try {
            checkResult = checkTenWithThrows(5);
        } catch (NotTenException e){
            System.out.println("e = " + e);
        }
        System.out.println("checkResult = " + checkResult);
    }
}
