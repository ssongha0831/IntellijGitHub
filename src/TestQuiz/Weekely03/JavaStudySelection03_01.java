// 송하연
package TestQuiz.Weekely03;

import java.util.*;

public class JavaStudySelection03_01 {
    private static final int MAX = 45;
    private static final int COUNT = 6;

    private static List<Integer> generateLottoNumbers() {
        List<Integer> nums = new ArrayList<>();
        while (nums.size() < COUNT) {
            int n = (int) (Math.random() * MAX) + 1;
            if (!nums.contains(n)) nums.add(n);
        }
        Collections.sort(nums);
        return nums;
    }

    private static String format(List<Integer> nums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.size(); i++) {
            sb.append(String.format("%02d", nums.get(i)));
            if (i < nums.size() - 1) sb.append(",");
        }
        return sb.toString();
    }

    private static int matchCount(List<Integer> a, List<Integer> b) {
        int cnt = 0;
        for (int n : a) if (b.contains(n)) cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[로또 당첨 프로그램]");
        System.out.print("로또 개수를 입력해 주세요(숫자 1 ~ 10) : ");

        int count;
        try {
            count = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다. 숫자를 입력해 주세요!");
            return;
        }
        if (count < 1 || count > 10) {
            System.out.println("1 ~ 10 사이 숫자를 입력해 주세요");
            return;
        }

        List<List<Integer>> purchased = new ArrayList<>();
        char label = 'A';
        for (int i = 0; i < count; i++) {
            List<Integer> one = generateLottoNumbers();
            purchased.add(one);
            System.out.println(label++ + "  " + format(one));
        }


        List<Integer> winning = generateLottoNumbers();
        System.out.println("\n[로또 발표]");
        System.out.println(format(winning));
        System.out.println("\n[내 로또 결과]");
        label = 'A';
        for (List<Integer> lotto : purchased) {
            int m = matchCount(lotto, winning);
            System.out.println(label++ + "  " + format(lotto) + " => " + m + "개 일치");
        }

        sc.close();
    }
}
