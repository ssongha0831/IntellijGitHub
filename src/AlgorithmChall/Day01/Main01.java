package AlgorithmChall.Day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main01 {
    static final long UND = -1;
    static List<Long> memo ;
    
    public static long t(int n){
        if (n == 0) {
            return 1;
        }
        if (memo.get(n) != UND) {
            return memo.get(n);
        }

        long ret = 0;
        for (int nxt = 0; nxt < n; nxt++) {
            ret += t(nxt) * t(n - nxt -1);
        }
        return ret;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        memo = new ArrayList<>(Collections.nCopies(N + 1, UND));

        System.out.println(t(N));
    }
}
