package AlgorithmChall.Day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main01_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<List<Integer>> table = new ArrayList<>(Collections.nCopies(N + 1, null));
        List<List<Integer>> graph = new ArrayList<>(Collections.nCopies(N + 1, null));

        for (int i = 0; i <= N; i++) {
            table.set(i, new ArrayList<>(Collections.nCopies(N + 1, 0)));
            graph.set(i, new ArrayList<>(Collections.nCopies(N + 1, 0)));
        }

        for (int r = 1; r <= N; r++) {
            st = new StringTokenizer(br.readLine());
            for (int c = 1; c <= N; c++) {
                int value = Integer.parseInt(st.nextToken());
                graph.get(r).set(c, value);
                table.get(r).set(c, graph.get(r).get(c)
                        + table.get(r - 1).get(c)
                        + table.get(r).get(c - 1)
                        - table.get(r -1).get(c - 1)
                );
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int sr = Integer.parseInt(st.nextToken());
            int sc = Integer.parseInt(st.nextToken());
            int er = Integer.parseInt(st.nextToken());
            int ec = Integer.parseInt(st.nextToken());

            int result = table.get(er).get(ec)
                    - table.get(sr - 1).get(ec)
                    - table.get(er).get(sc - 1)
                    + table.get(sr - 1).get(sc - 1);

            System.out.println(result);
        }
    }
}
