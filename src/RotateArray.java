//Given an array, rotate the array to the right by k steps, where k is non-negative.
//Example:
//Input: [1,2,3,4,5,6,7] and k = 3
//Output: [5,6,7,1,2,3,4]

// the requirement is In-place algorithm, so I will not create any new array or collection in the solution.
public class RotateArray {

    private int swap(int a, int b) {
        return a;
    }

    public int[] rotate(int[] input, int k) {
        return rotateSub(input, k, 0);
    }

    public int[] rotateSub(int[] input, int k, int start) {

        if (input.length - start < k)
            return input;

        for (int i = start; i < input.length; i++) {
            int i1 = input.length - k + i - start;
            if (i1 >= input.length)
                break;
            input[i] = swap(input[i1], input[i1] = input[i]);
        }

        rotateSub(input, k, start + k);
        return input;
    }


}
