//1.Given an unsorted integer array,  find the largest sum in a contiguous subarray.
// E.g. [1,2,-4,3,4,-1,4,5,-10], the result is sum([3,4,-1,4,5]) = 15. And how to design it in a web service.

//2. Given a list of binary trees, find the largest sum for a subtree.

public class Main {
    public static void main(String[] args) {
        //runSubTreeSum();
        arrayMaxContiguousSum();
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
}
