import java.util.*;

public class HashMapExample {
    public static void call() {
        HashMap<Integer, String> map = new HashMap<>();
        System.out.println(map.containsKey(1));
        System.out.println(map.get(1));
        map.put(1, "One");
        map.put(1, "OOOOOONNNNNEEE");
        System.out.println(map.remove(1));
        System.out.println(map.containsKey(1));
    }
}
