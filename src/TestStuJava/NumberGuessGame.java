package TestStuJava;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        int[] arr = new int[5]; // 5칸짜리 배열
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        /*
        // 배열에 랜덤 값(0~9) 채우기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10); // 0~9 사이
        }

         */
        for (int i = 0; i < arr.length; i++){
            System.out.print((i+1) + "번째 숫자 입력 (0 ~ 9) : ");
            arr[i] = scanner.nextInt();

        }
        System.out.println();

        System.out.println("배열(정답) : " + Arrays.toString(arr));


        int count = 3;
        for (int j = 0 ; j < count; j++){
            System.out.print("0~9 사이 숫자 하나 맞혀보세요: ");
            int guess = scanner.nextInt();

            boolean found = false;
            int index = Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)).indexOf(guess);
            if (Arrays.stream(arr).anyMatch(n -> n == guess)) {
                found = true;
                System.out.println("🎉 정답! 배열 안에 " + guess + " 이(가) " + index + "번째 있어요!");
                break;
            } else {
                System.out.println("❌ 아쉽게도 " + guess + " 은(는) 배열에 없어요.\n");
            }

        }
        scanner.close();
    }
}
