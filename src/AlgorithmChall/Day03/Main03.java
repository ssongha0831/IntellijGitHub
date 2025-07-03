package AlgorithmChall.Day03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class  Vertex2 implements Comparable<Vertex> {
    int v;
    int w;

    public Vertex2(int v, int w) {
        this.v = v;
        this.w = w;
    }

    @Override
    public int compareTo(Vertex other) {
        return Integer.compare(this.w, other.w);
    }

    @Override
    public String toString() {
        return "Vertex2{" +
                "v=" + v +
                ", w=" + w +
                '}';
    }
}

public class Main03 {
    static final int INF = 0x6FFFFFFF;
    static int V, E, K;
    static List<List<Vertex2>> graph;
    static List<Integer> dist;
    static PriorityQueue<Vertex2> q = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>(Collections.nCopies(V + 1, new ArrayList<>()));

        for (int i = 0; i <= V; i++) {
            graph.set(i, new ArrayList<>());
        }

        for (int i = 1; i <= E; i++) {
            st = new StringTokenizer(br.readLine());
            int tu = Integer.parseInt(st.nextToken());
            int tv = Integer.parseInt(st.nextToken());
            int tw = Integer.parseInt(st.nextToken());
            graph.get(tu).add(new Vertex2(tv, tw));
        }

        dist = new ArrayList<>(Collections.nCopies(V + 1, INF));
        dist.set(K, 0);
        q.add(new Vertex2(K, dist.get(K)));

        while (!q.isEmpty()) {
            Vertex2 pres = q.poll();
            System.out.println(pres);
            System.out.println(q);
            for (Vertex2 next : graph.get(pres.v)) {
                if (dist.get(next.v) > pres.w + next.w) {
                    dist.set(next.v, pres.w + next.w);
                    q.add(new Vertex2(next.v, dist.get(next.v)));
                }
            }
        }

        printDistance();
    }

    public static void printDistance() {
        for (int i = 1; i <= V; i++) {
            if (dist.get(i) == INF) {
                System.out.println("INF");
            } else {
                System.out.println(dist.get(i));
            }
        }
    }
}
