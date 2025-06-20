package JavaAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SelectionSort {

    public static void selectionSortArr(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // 최소값을 현재 위치(i)와 교환
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputData = br.readLine().split(" ");
        int[] arr = new int[inputData.length];

        for (int i = 0; i < inputData.length; i++){
            arr[i] = Integer.parseInt(inputData[i]);
        }

        System.out.println("정렬 전 : " + Arrays.toString(arr));
        selectionSortArr(arr);
        System.out.println("정렬 후 : " + Arrays.toString(arr));
    }
}
