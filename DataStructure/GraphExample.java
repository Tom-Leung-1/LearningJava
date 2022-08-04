import java.util.*;

public class GraphExample {
    public static void call() {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int[][] edges = {{1,2}, {1,3}, {2, 3}, {3, 4}};
        for (int[] edge : edges) {
            if (map.containsKey(edge[0])) {
                map.get(edge[0]).add(edge[1]);
            }
            else {
                map.put(edge[0], new ArrayList<>(Arrays.asList(edge[1])));
            }
        }
        for(Integer key: map.keySet()) {
            System.out.printf("%d: ", key);
            for (Integer val: map.get(key)) {
                System.out.printf("%d, ", val);
            }
            System.out.println();
        }
    }
}
