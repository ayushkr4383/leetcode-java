class Solution {
    public int[] runningSum(int[] nums) {
        int i=0, j;
        int n = nums.length;
        for(i=0, j=i+1;j<n;i++, j++){
            nums[j] = nums[i]+nums[j];
        }
        return nums;

    }
}