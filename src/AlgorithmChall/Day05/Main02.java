package AlgorithmChall.Day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
class Order {
    int op, a, b;

    public Order(int b, int a, int op) {
        this.b = b;
        this.a = a;
        this.op = op;
    }
}

public class Main02 {
    static int N, M;
    static List<Set<Integer>> setLimk;
    static List<Order> orders;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        setLimk = new ArrayList<>(Collections.nCopies(N + 1, null));

        for (int n = 0; n <= N; n++) {
            setLimk.set(n, new HashSet<>());
            setLimk.get(n).add(n);
        }

        orders = new ArrayList<>();
        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            int op = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            orders.add(new Order(op, a, b));
        }

        for (Order o : orders) {
            if (o.op == 0) {
                var setA = setLimk.get(o.a);
                var setB = setLimk.get(o.b);
                setA.addAll(setB);
                for (Integer item : setA) {
                    setLimk.set(item, setA);
                }
            } else {
                if (setLimk.get(o.a).contains(o.b)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
*/