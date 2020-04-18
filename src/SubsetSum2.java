//Given an unsorted array and a target, return the minimum length of continuous subarray whose sum is greater than or equal to target.
// E.g. [1,2,3,1,4,3], target = 7, return 2, because the minimum length of continuous subarray is [4,3]

import java.util.ArrayList;
import java.util.List;

// running time is O(n*2) => need to improve this algorithm
public class SubsetSum2 {

    List<Integer> rs = new ArrayList<>();

    public List<Integer> findSubset(int[] a, int target) {

        for (int i = 0; i < a.length; i++) {

            if (a[i] > target)
                continue;

            List<Integer> sub = new ArrayList<>();
            int sum = a[i];
            sub.add(a[i]);
            if (sum == target) {
                rs = sub;
            }

            for (int j = i + 1; j < a.length; j++) {
                sum += a[j];
                if (sum > target)
                    break;
                sub.add(a[j]);
                if (sum == target) {
                    if (rs.size() == 0)
                        rs = sub;
                    else
                        rs = rs.size() < sub.size() ? rs : sub;
                    break;
                }
            }
        }

        System.out.println(rs);
        return rs;
    }
}
