// 송하연
package TestQuiz.Weekely03;

import java.util.Scanner;

public class JavaStudySelection03_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] incomeRange = {12000000, 46000000, 88000000, 150000000,
                300000000, 500000000, 1000000000};
        int[] taxRate = {6, 15, 24, 35, 38, 40, 42, 45};
        int[] deduction = {0, 1080000, 5220000, 14900000,
                19400000, 25400000, 35400000, 65400000};

        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요 : ");
        long income = sc.nextLong();

        long taxByStep = 0;
        long remaining = income;

        for (int i = 0; i < incomeRange.length; i++) {
            int range = (i == 0) ? incomeRange[i] : incomeRange[i] - incomeRange[i-1];

            if (income > incomeRange[i]) {
                long tax = (long)(range * taxRate[i] / 100.0);
                taxByStep += tax;
                System.out.printf("%,d * %d%% = %,d%n", range, taxRate[i], tax);
            } else {
                long tax = (long)(remaining * taxRate[i] / 100.0);
                taxByStep += tax;
                System.out.printf("%,d * %d%% = %,d%n", remaining, taxRate[i], tax);
                break;
            }
            remaining -= range;
        }

        long taxByDeduction = 0;
        for (int i = 0; i < incomeRange.length; i++) {
            if (income <= incomeRange[i]) {
                taxByDeduction = (long)(income * taxRate[i] / 100.0) - deduction[i];
                break;
            }
            if (i == incomeRange.length - 1) {
                taxByDeduction = (long)(income * taxRate[i+1] / 100.0) - deduction[i+1];
            }
        }

        System.out.println("\n[세율에 의한 세금] : " + String.format("%,d", taxByStep));
        System.out.println("[누진공제 계산에 의한 세금] : " + String.format("%,d", taxByDeduction));

        sc.close();
    }
}
