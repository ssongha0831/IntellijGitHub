package JavaBasic.JavaStudy;
// 송하연
public class JavaStudy07 {
    public static void main(String[] args){
        String[][] words = {
                {"어제", "내일"},
                {"나는", "동생은"},
                {"여행을", "학교에"},
                {"다녀왔다", "갈 예정이다"}
        };

        System.out.println("문장 1: " + words[0][0] + " " + words[1][0] + " " + words[2][0] + " " + words[3][0]);
        System.out.println("문장 2: " + words[0][1] + " " + words[1][1] + " " + words[2][1] + " " + words[3][1]);
    }
}
