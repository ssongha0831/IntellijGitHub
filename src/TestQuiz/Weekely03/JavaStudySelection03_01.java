package TestQuiz.Weekely03;

import java.util.*;

class LottoNumberGenerator {
    private static final int MAX = 45;
    private static final int COUNT = 6;

    public List<Integer> generateLottoNumbers() {
        List<Integer> list = new ArrayList<>();

        while (list.size() < COUNT) {
            int n = (int)(Math.random() * MAX) + 1;
            if (!list.contains(n)) {
                list.add(n);
            }
        }
        Collections.sort(list);
        return list;
    }
}

public class JavaStudySelection03_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[로또 당첨 프로그램]");
        int num = 0;
        try {
            System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10): ");
            num = scanner.nextInt();

            if (num > 11) {
                System.out.println("1 ~ 10 사이 숫자를 입력해 주세요");
            }
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다. 숫자를 입력해 주세요.");
            return;
        }

        List<List<Integer>> purchasedLottos = new ArrayList<>();
        LottoNumberGenerator generator = new LottoNumberGenerator();
        for (int i = 0;  i < num; i++) {
            List<Integer> oneLotto = generator.generateLottoNumbers();
            purchasedLottos.add(oneLotto);
        }

        char label = 'A';
        for (List<Integer> lotto : purchasedLottos) {
            System.out.println(label + "  " + lotto);
            label++;
        }


    }
}
