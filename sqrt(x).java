
class Solution {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        long j = 0;
        int i = 0;
        int n = x / 2;
        int left = 1, right = n;
        int k = binarysearch(x, left, right);
        return k;

    }

    int binarysearch(int x, int left, int right) {
        long j;

        if (left > right) {
            return right;
        }
        int mid = (left + right) / 2;
        j = (long) mid * mid;

        if (j > x) {
            return binarysearch(x, left, mid - 1);
        }
        if (j == x) {
            return mid;
        } else {
            return binarysearch(x, mid + 1, right);
        }
    }
}
