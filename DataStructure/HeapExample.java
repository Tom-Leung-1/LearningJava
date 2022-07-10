import java.util.PriorityQueue;
import java.util.*;

public class HeapExample {
    public static class Pair {
        int key;
        int val;
        
        Pair(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    public static void call() {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        // min heap (a, b) -> a - b
        // a - b < 0 -> a < b -> a first b second
        // a - b > 0 -> a > b -> a second b first
        // max heap (a, b) -> b - a
        // b - a < 0 -> a > b -> a first b second
        // b - a > 0 -> a < b -> a second b first
        pq.add(1); pq.add(100); pq.add(10);
        System.out.println(pq.peek());

        PriorityQueue<Pair> pq2 = new PriorityQueue<>((pair1, pair2) -> pair2.val - pair1.val);
        pq2.add(new Pair(1, 2)); pq2.add(new Pair(2, 300)); pq2.add(new Pair(3, 100)); 
        System.out.println(pq2.peek().key);
    }
}
