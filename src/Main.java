import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //runSubTreeSum();
        //arrayMaxContiguousSum();
//        binarySearch();
//        findSubsetSumByTarget();
        findTimeRange();
    }

    // Given an unsorted integer array,
    // find the largest sum in a contiguous subarray.
    // E.g. [1,2,-4,3,4,-1,4,5,-10],
    // the result is sum([3,4,-1,4,5]) = 15.
    // And how to design it in a web service.
    public static void arrayMaxContiguousSum() {
        int[] a = {1, 2, -4, 3, 4, -1, 4, 5, -10};
        LargestSum largestSum = new LargestSum();
        System.out.println(largestSum.maxSum(a));
    }

    //Given a list of binary trees, find the largest sum for a subtree.
    public static void runSubTreeSum() {
        Node root = new Node(1);
        root.left = new Node(-2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(-6);
        root.right.right = new Node(2);
        SubtreeSum subtreeSum = new SubtreeSum();
        System.out.println(subtreeSum.findLargestSubtreeSum(root));
    }

    //implement binary search
    public static void binarySearch() {
        int[] a = {1, 3, 5, 6, 7, 9, 11, 23, 25, 27, 28};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println("index of k : " + binarySearch.searchIndexOfNum(a, 28));
    }

    //Given an unsorted array and a target,
    // return the minimum length of continuous subarray whose sum is greater than or equal to target.
    // E.g. [1,2,3,1,4,3], target = 7, return 2, because the minimum length of continuous subarray is [4,3]
    public static void findSubsetSumByTarget() {
        int[] a = {1, 2, 3, 1, 4, 3, 7};
        SubsetSum2 subsetSum2 = new SubsetSum2();
        subsetSum2.findSubset(a, 7);
    }

    //Given a list of running time range for a server with start time and end time, no overlap,
    // [[0,30], [35,40], .... , [100,104], [105, 110]], input a time point,
    // return check whether the server was running at that point
    public static void findTimeRange(){
        List<int[]> input = new ArrayList<>();
        input.add(new int[]{0, 30});
        input.add(new int[]{35, 40});
        input.add(new int[]{45, 60});
        input.add(new int[]{61, 100});
        input.add(new int[]{106, 130});
        input.add(new int[]{150, 180});
        input.add(new int[]{182, 199});
        SearchRunningTimeRage searchRunningTimeRage = new SearchRunningTimeRage();
        System.out.println(Arrays.toString(searchRunningTimeRage.findTimeRange(input, 100)));
    }

}
