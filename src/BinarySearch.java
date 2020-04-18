//Implement binary search.

public class BinarySearch {

    public int searchIndexOfNum(int[] a, int k) {
        return BS(a, 0, a.length, k);
    }

    private int BS(int[] a, int min, int max, int k) {

        if (max == min)
            return a[max] == k ? max : -1;

        int mid = (max + min) / 2;

        if (a[mid] == k)
            return mid;
        if (k > a[mid])
            return BS(a, mid, max, k);
        if (k < a[mid])
            return BS(a, min, mid, k);

        return -1;
    }
}
