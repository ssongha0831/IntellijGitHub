package JavaStudy;

public class JavaStudy05 {
    public static void main(String[] args){
        int score = 50;
        String result = ( score >= 50 ) ? "합격!" : "불합격";
        System.out.println(result);
        System.out.println("삼항 연산자 : " + result);
    }
}
