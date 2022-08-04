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
    // set up custom comparator 
    /* 
    public static class <self-defined name> implements Comparator<T> {
        public int compare(<T> a, <T> b) {
            return <-, 0, +>
        }
        - : a before b
        + : b before a
    }
    */
    
    public static class CustomComparator implements Comparator<Node> {
        public int compare(Node node1, Node node2) {
            return node1.val - node2.val; // ascending order
        }
    }

    public static class CustomComparator2 implements Comparator<String> {
        public int compare(String a, String b) {
            char letter1 = a.charAt(a.length()-1);
            char letter2 = b.charAt(b.length()-1);
            return letter1 - letter2;
        }
    }

    // the comparator Type must match the type of the array
    public static class CustomComparator3 implements Comparator<Integer> {
        public int compare(Integer a, Integer b) {
            return b-a;
        }
    }

    public static void call() {
        String strs[] = {"Orange", "Apple", "Banana"};
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
        // sort array
        Arrays.sort(strs);
        for (String str : strs) {
            System.out.println(str);
        }
        // sort array with custom functions
        Arrays.sort(strs, new CustomComparator2());
        for (String str : strs) {
            System.out.println(str);
        }
        // integer array case (use Integer instead of int)
        Integer[] intArr = {1,2,3,4,5,6,7,8};
        Arrays.sort(intArr, new CustomComparator3());
        for (Integer num : intArr) {
            System.out.println(num);
        }
        System.out.println(nodeList.size());
        
    }
}
