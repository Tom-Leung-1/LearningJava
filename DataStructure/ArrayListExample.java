import java.util.*;

public class ArrayListExample {
    public static void call() {
        String strs[] = {"Apple", "Orange", "Banana"};
        // initialize a list
        List<String> list = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();
        // append a new item
        for (String str : strs) {
            list.add(str);
        }
        // loop over the list
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("--------");
        // set
        list.set(0, "StrawBerry");
        // get
        System.out.println(list.get(0));
        // remove O(N) complexity. Use linked list for O(1) complexity
        list.remove(1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // sort arrayList
    }
}
