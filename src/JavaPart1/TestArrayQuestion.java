package JavaPart1;

public class TestArrayQuestion {
    public static void main(String[] args) { // 나중에 다시 한번 해보기!! 
        int[][] testArray1 = {{0,0,0}, {0,0,0}, {0,0,0}};

        for (int i = 0; i < testArray1.length; i++) {
            for (int j = 0; j < testArray1[i].length; j++) {
                testArray1[i][j] = 1;

                if (i == j) {
                    testArray1[i][j] = 10;
                }
            }
        }
        for (int[] itemRow : testArray1) {
            for (int itemCol : itemRow) {
                System.out.print(itemCol + " ");
            }
            System.out.println( );
        }
    }
}
