//3. Given a list of binary trees, find the largest sum for a subtree.

public class SubtreeSum {

    int max = -999999999;

    public int findLargestSubtreeSum(Node node) {
        if (node == null)
            return 0;
        else
            findLargestByDirection(node);
        return max;
    }

    private int findLargestByDirection(Node node) {
        if (node == null)
            return 0;
        int sum = node.key + findLargestByDirection(node.left) + findLargestByDirection(node.right);
        max = Math.max(sum, max);
        return sum;
    }
}
