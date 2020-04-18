//1.Given an unsorted integer array,
// find the largest sum in a contiguous subarray.
// E.g. [1,2,-4,3,4,-1,4,5,-10],
// the result is sum([3,4,-1,4,5]) = 15.
// And how to design it in a web service.

import java.util.ArrayList;
import java.util.List;

public class LargestSum {

    int max, sum, start, end, tempStart = 0;

    public List<Integer> maxSum(int a[]) {

        List<Integer> rs = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (max < sum) {
                max = sum;
                end = i;
                start = tempStart;
            }
            if (sum < 0) {
                sum = 0;
                tempStart = i + 1;
            }
        }

        for (int i = start; i <= end; i++) {
            rs.add(a[i]);
        }
        System.out.println(rs.stream().reduce(0, (c, b) -> c + b));
        return rs;
    }
}
