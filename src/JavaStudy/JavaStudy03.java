package JavaStudy;

public class JavaStudy03 {
    public static void main(String[] args){
        System.out.println("=== 업캐스팅 ===");
        int number = 10;
        double doubleNumber = number;
        System.out.println("int 값 : " + number);
        System.out.println("doubleNumber 값 : " + doubleNumber);

        System.out.println();
        System.out.println("=== 다운 캐스팅 ===");
        double score = 93.7;
        int scoreInt = (int) score;
        System.out.println("double 값 : " + score);
        System.out.println("int 값 : " + scoreInt);
    }
}
