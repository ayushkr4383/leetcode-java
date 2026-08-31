class Solution {
    public int singleNumber(int[] nums) {
        int i = 0;
        int n = nums.length;
        int k = 0;
        for (i = 0; i < n; i++) {
            k = k ^ nums[i];
        }
        return k;

    }
}