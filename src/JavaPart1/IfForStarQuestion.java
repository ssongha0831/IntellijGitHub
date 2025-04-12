package JavaPart1;

public class IfForStarQuestion {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            if ((i % 2) == 0){
                continue;
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
    for (int j = 0; j < i; j++) {
        for (int i = 0; i < 5; j++) {
            if ((i % 2) == 0) {
                System.out.print("^");
            }
        }
        System.out.print("*");
        System.out.println();
    }
    //System.out.println();

 */
    }
}
