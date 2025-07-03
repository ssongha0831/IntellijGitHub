package AlgorithmChall.Day03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Vertex {
    int n;
    int w;

    public Vertex(int n, int w) {
        this.n = n;
        this.w = w;
    }
}

public class Main01 {
    static final int UND = -1;
    static int N, K, MAX;

    static List<Integer> visited;
    static Deque<Vertex> dq = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        MAX = Math.max(N, 2 * K);

        visited = new ArrayList<>(Collections.nCopies(MAX + 1, UND));
        dq.addLast(new Vertex(N, 0));

        while (!dq.isEmpty()) {
            Vertex cur = dq.pollFirst();
            if (visited.get(cur.n) == UND) {
                visited.set(cur.n, cur.w);
                List<Vertex> nextList = Arrays.asList(
                        new Vertex(cur.n * 2, cur.w),
                        new Vertex(cur.n + 1, cur.w + 1),
                        new Vertex(cur.n - 1, cur.w + 1)
                );

                for (Vertex nxt : nextList) {
                    if (0 < nxt.n && nxt.n <= MAX) {
                        if (nxt.w == cur.w) {
                            dq.addFirst(nxt);
                        } else {
                            dq.addLast(nxt);
                        }
                    }
                }
            }
        }
        System.out.println(visited.get(K));
    }
}
