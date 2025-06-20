package TestStuJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class ArrayMaxFrequency {
    public static void main(String[] args) throws IOException {

        int size = 20; // 배열의 길이
        int[] arr = new int[size];

        int[] freq = new int[11];
        Random random = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10) + 1;
            freq[arr[i]]++;
        }
        System.out.println("랜덤 배열 : " + Arrays.toString(arr));

        // 가장 많은 수 등장 횟수 계산
        int maxFreq = 0;
        for (int count : freq) {
            if (count > maxFreq) {
                maxFreq = count;
            }
        }

        boolean found = false;
        for (int i = 1; i <= 10; i++) {
            if (freq[i] == maxFreq) {
                System.out.println("가장 많이 등장한 숫자 : " + i );
                System.out.println("등장 횟수 : " + maxFreq);

                found = true;
                break;
            }
        }
        //System.out.println("가장 많이 등장한 숫자 : " + maxFreq);
    }
}
