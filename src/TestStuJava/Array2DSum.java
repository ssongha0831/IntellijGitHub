package TestStuJava;

/*
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
출력값 : 45
 */

public class Array2DSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int toSum  = 0;

        for (int[] row : matrix)  {
            int sum = 0;
            for (int num : row) {
                sum += num;
            }
            toSum += sum;
        }
        System.out.println("총합 : " + toSum);
    }
}
