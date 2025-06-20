package TestStuJava;

import java.util.Arrays;

public class ArrayCopyTrace {
    public static void main(String[] args) {
        int[] original = {1,2,3,4,5};

        int[] copyArray = original.clone();

        System.out.println("원본 배열 : " + Arrays.toString(original));
        System.out.println("복사본 배열 : " + Arrays.toString(copyArray));

        copyArray[0] = 100;

        System.out.println();
        System.out.println("변경 후 원본 배열 : " + Arrays.toString(original));
        System.out.println("변경 후 복사본 배열 : " + Arrays.toString(copyArray));
    }
}
