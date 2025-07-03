package AlgorithmChall.Day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main02 {
    static final int UND = -1;
    static List<Integer> memo ;
    static final int MAX = 11;

    public static int f(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (memo.get(n) != UND) {
            return memo.get(n);
        }
        memo.set(n, f(n - 1) + f(n - 2) + f(n - 3));
        return memo.get(n);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        memo = new ArrayList<>(Collections.nCopies(MAX + 1, UND));

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(f(N));
        }
    }
}
