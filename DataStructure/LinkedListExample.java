import java.util.*;

public class LinkedListExample {
    static public void call() {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1); l1.add(0, 2); l1.addFirst(3);
        for (Integer num : l1) {
            System.out.println(num);
        }
        System.out.println("-----");
        System.out.println(l1.get(1));
        System.out.println(l1.size());
        l1.set(2, 100);
        System.out.println(l1.getLast());
        System.out.println(l1.getFirst());
    }
}
