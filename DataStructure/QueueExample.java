import java.util.*;

public class QueueExample {
    public static void call() {
        // As the Queue is an interface, it cannot be instantiated. We need some concrete classes to implement the functionality of the Queue interface. i.e. LinkedList / Priority Queue
        Queue<Integer> q = new LinkedList<>();
        q.add(1); q.add(2); q.add(3); q.offer(4);
        System.out.println(q.size());
        System.out.println(q.poll());
        System.out.println(q.peek());
    }
}
