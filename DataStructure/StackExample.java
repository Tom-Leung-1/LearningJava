import java.util.*;

public class StackExample {
    public static class Node {
        int min;
        int val;
        Node(int min, int val) {
            this.min = min;
            this.val = val;
        }
    }
    static public void call() {
        Stack<Node> stack = new Stack<>();
        stack.add(new Node(1, 1));
        stack.add(new Node(1, 2));
        for (Node n : stack) {
            System.out.printf("Min: %d, Val: %d\n", n.min, n.val);
        }
        stack.pop();
        System.out.println(stack.peek().val);
    }
}
