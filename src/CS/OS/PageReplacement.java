/* 송하연*/
package CS.OS;
import java.util.*;

public class PageReplacement {

    public static void main(String[] args) {
        int[] pages = {1, 2, 3, 4, 2, 5, 1, 2, 3, 4, 5, 1};
        int frameSize = 3;

        System.out.println("=== FIFO 페이지 교체 ===");
        fifo(pages, frameSize);

        System.out.println("\n=== LRU 페이지 교체 ===");
        lru(pages, frameSize);
    }

    public static void fifo(int[] pages, int frameSize) {
        Set<Integer> memory = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        int pageFaults = 0;

        for (int page : pages) {
            if (!memory.contains(page)) {
                if (memory.size() == frameSize) {
                    int removed = queue.poll();
                    memory.remove(removed);
                }
                memory.add(page);
                queue.add(page);
                pageFaults++;
                System.out.println("Page " + page + ": MISS → " + memory);
            } else {
                System.out.println("Page " + page + ": HIT  → " + memory);
            }
        }

        System.out.println("총 Page Fault 수 (FIFO): " + pageFaults);
    }

    public static void lru(int[] pages, int frameSize) {
        List<Integer> memory = new ArrayList<>();
        int pageFaults = 0;

        for (int page : pages) {
            if (memory.contains(page)) {
                memory.remove(Integer.valueOf(page));
                memory.add(page);
                System.out.println("Page " + page + ": HIT  → " + memory);
            } else {
                if (memory.size() == frameSize) {
                    memory.remove(0);
                }
                memory.add(page);
                pageFaults++;
                System.out.println("Page " + page + ": MISS → " + memory);
            }
        }

        System.out.println("총 Page Fault 수 (LRU): " + pageFaults);
    }
}
