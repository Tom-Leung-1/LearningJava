import java.util.*;

public class ArrayListExample {
    public static class Node {
        int key;
        int val;
        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    // set up custome comparator 
    public static class CustomComparator implements Comparator<Node> {
        public int compare(Node node1, Node node2) {
            return node1.val - node2.val; // ascending order
        }
    }

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
        ArrayList<Node> nodeList = new ArrayList<>();
        nodeList.add(new Node(-3, 3)); nodeList.add(new Node(-2, 2)); nodeList.add(new Node(-1, 1));
        // sort arrayList
        Collections.sort(nodeList, new CustomComparator());
        for (Node n : nodeList) {
            System.out.println(n.key);
        }
    }
}
