package JavaPart1;
// 계산기 덧셈의 여러타입 오버로딩

class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
    public double sum(double a, double b) {
        return a + b;
    }
    public double sum(String a, String b) {
        return Double.parseDouble(a) + Double.parseDouble(b); // String을 Double로 변환? 인지 반대로 Double로 리턴 받은 값을 String으로 받는건지??
    }
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    /* 내가 한거
    public double sum(double a, double b) {
        return a + b;
    }

    public String sum(String a, String b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }
    */



}



public class PracticeQuestion {
    public static void main(String[] main) {
        // Test code
        /* 내가 한거
        Calculator c = new Calculator();
        System.out.println(c.sum(1,2));
        System.out.println(c.sum(1.0, 2.0));
        System.out.println(c.sum("1", "2"));
        System.out.println(c.sum(1,2,3));
        */

        Calculator c = new Calculator();
        System.out.println(c.sum(1,2));
        System.out.println(c.sum(1.0, 2.0));
        System.out.println(c.sum("1", "2"));
        System.out.println(c.sum(1,2,3));

    }
}
