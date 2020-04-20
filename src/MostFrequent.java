import java.util.Arrays;

// total running time = O(n) + O(nlogn) + k = O(nlogn)
public class MostFrequent {

    public int[] findMostFrequent(int[] a, int k) {

        int[] rs = new int[k];
        int[] nums = new int[a.length];
        int[] counts = new int[a.length];
        Arrays.fill(counts, 0);
        int index = 0;
        nums[0] = a[0];
        counts[0] = 1;

        // running time for this is 0(n)
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] != a[i]) {
                index++;
                nums[index] = a[i];
            }
            counts[index] += 1;
        }

        // running time for this loop is O(nlogn)
        for(int i = 0; i < Math.min(a.length, k); i ++){
            int max = i;
            for(int j = i+1 ; j < counts.length; j++){
                if(counts[max] < counts[j]){
                    max = j;
                }
            }
            if (max != i){
                int temp = a[max];
                counts[max] = counts[i];
                counts[i] = temp;
            }
            rs[i] = nums[max];
        }
        System.out.println(Arrays.toString(rs));
        return rs;
    }
}
