package JavaAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSortArr(int[] arr) {
        int size = arr.length;
        boolean swapped;

        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            for (int j = 0 ; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputData = br.readLine().split(" ");

        int[] arr = new int[inputData.length];
        for (int i = 0; i < inputData.length; i++) {
            arr[i] = Integer.parseInt(inputData[i]);
        }

        System.out.println("정렬 전 : " + Arrays.toString(arr));
        bubbleSortArr(arr);
        System.out.println("정렬 후 : " + Arrays.toString(arr));

    }
}
