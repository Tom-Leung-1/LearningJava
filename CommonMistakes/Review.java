import java.util.*;

public class Review {
    static class Pair {
        int key;
        int val;
        Pair(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    // write a main method first!
    public static void main(String args[]) {
        // 1. to access the value of a char array
        char[] arr = {'1'}; // remember the array name
        System.out.println(arr[0] == '1');
        // 2. you cannot make a instance out of template, it must be a class
        List<Integer> result = new ArrayList<>();
        // 3. no variable name collision
        // 4. declaring a new array
        // 5. check index out of bound error
        int dp[] = new int[10];
        // 6. Math.min() (not min())
        // 7. ternary expression: <must be boolean> ? true value : false value
        // 8. remember to add the type when declaring a variable
        int cost = dp.length > 0 ? 1 : 0;
        System.out.println(cost);
        // 9. accessing attribute: (Java way) <instance>.<attr>  (not <instance>-><attr> for C++)
        // 10. you can declare a inner class without providing any access keyword
        // 11. remember to add a static keyword before the inner class if you want to declare it without constructing a parent class instance 1st
        // 12. THERE IS NO PAIR in java.util. Use ArrayList is also ok
        PriorityQueue<Pair> pq = new PriorityQueue<>((pair1, pair2) -> pair1.val - pair2.val); // min heap
        pq.offer(new Pair(-1, 2)); pq.offer(new Pair(-2, 3)); pq.offer(new Pair(-3, 4));
        System.out.println(pq.peek().val);

    }
    
}
