class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int curpro = nums[0];
        int maxpro = nums[0];
        int minpro = nums[0];
        for(int i=1;i<nums.length;i++){
            int temp= curpro;
            curpro = Math.max(nums[i],Math.max(temp*nums[i], minpro*nums[i]));
            minpro = Math.min(nums[i], Math.min(temp*nums[i], minpro*nums[i]));
            maxpro = Math.max(maxpro, curpro);
        }
        return maxpro;
    }
}