package AlgorithmChall.Day03;
import java.util.PriorityQueue;

class Point implements Comparable<Point> {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public int compareTo(Point other) {
        if (this.x == other.x) {
            return this.y - other.y;
        }
        return this.x - other.y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class Main02 {
    public static void main(String[] args) {
        PriorityQueue<Point> pq = new PriorityQueue<>();
        pq.add(new Point(4, 5));
        pq.add(new Point(1, 2));
        pq.add(new Point(1, 3));
        pq.add(new Point(2, 3));
        pq.add(new Point(2, 1));
        System.out.println(pq);
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
