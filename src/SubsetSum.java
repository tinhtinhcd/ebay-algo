//Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.
//The same repeated number may be chosen from candidates unlimited number of times.

//Note:
//All numbers (including target) will be positive integers.
//The solution set must not contain duplicate combinations.

//Example 1:
//Input: candidates = [2,3,6,7], target = 7,
//A solution set is:
//[
//  [7],
//  [2,2,3]
//]

//Example 2:
//Input: candidates = [2,3,5], target = 8,
//A solution set is:
//[
//  [2,2,2,2],
//  [2,3,3],
//  [3,5]
//]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SubsetSum {

    private List<List<Integer>> rs = new ArrayList<>();

    public void findSet(int[] a, int target) {

        //remove duplicate and sort the array
        List<Integer> input = Arrays.stream(a).boxed().sorted().distinct().collect(Collectors.toList());


    }

    private void sum(List<Integer> input, int sum){

    }

}
