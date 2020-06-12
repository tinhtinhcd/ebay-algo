import java.util.*;

// total running time = O(n) + O(nlogn) + k = O(nlogn)
public class MostFrequent {

    public int[] findMostFrequent(int[] a, int k) {

        int[] rs = new int[k];

        HashMap<Integer, Integer> maps = new HashMap<>();

        for (int i = 0; i < a.length; i++){
            maps.put(a[i], maps.getOrDefault(a[i], 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((n1,n2)-> n2.getValue() - n1.getValue());
        queue.addAll(maps.entrySet());

        for(int i = 0; i < k && !queue.isEmpty(); i++){
            rs[i] = queue.poll().getKey();
        }

        return rs;
    }
}
