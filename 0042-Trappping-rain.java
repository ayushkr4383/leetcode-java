class Solution {
    public int trap(int[] height) {
        int n, i, sum = 0;
        n = height.length;
        int maxright = 0, maxleft = 0;
        ;
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = height[0];
        right[n - 1] = height[n - 1];
        for (i = 0; i < n; i++) {
            if (height[i] > maxleft) {
                maxleft = height[i];
                left[i] = maxleft;
            } else {
                left[i] = maxleft;
            }
        }
        for (i = n - 1; i > 0; i--) {
            if (height[i] > maxright) {
                maxright = height[i];
                right[i] = maxright;
            } else {
                right[i] = maxright;
            }
        }
        for (i = 0; i < n; i++) {
            if (left[i] > 0 && right[i] > 0 && (height[i] <= left[i] || height[i] <= right[i])) {
                if (left[i] < right[i]) {
                    sum = sum + (left[i] - height[i]);
                } else {
                    sum = sum + (right[i] - height[i]);
                }
            }
        }
        return sum;

    }
}