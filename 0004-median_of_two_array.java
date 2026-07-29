
class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median;
        float result;
        int i = 0, j = 0, k, m, n, l, c, d, h = 0;
        m = nums1.length;
        n = nums2.length;
        k = m + n;
        int temp[] = new int[k];
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[h] = nums1[i];
                h++;
                i++;
            } else {
                temp[h] = nums2[j];
                j++;
                h++;
            }
        }
        while (i < m) {
            temp[h] = nums1[i];
            h++;
            i++;
        }
        while (j < n) {
            temp[h] = nums2[j];
            h++;
            j++;
        }
        l = temp.length;
        if (l % 2 == 0) {
            c = l / 2;
            d = (l / 2) - 1;
            median = (temp[c] + temp[d]) / 2.00000;
        } else {
            c = (l / 2);
            median = temp[c];

        }

        return median;
    }

}
