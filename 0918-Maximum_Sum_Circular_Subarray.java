class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int cursum=nums[0];
        int maxsum=nums[0];
        int i=1;
        int minsum=nums[0];
        int totalsum=0;
        int curmin=nums[0];
        for(int j=0;j<nums.length;j++){
            totalsum = totalsum+nums[j];
        }
        while(i<nums.length){
            cursum = Math.max(nums[i], cursum+nums[i]);
            curmin = Math.min(nums[i], curmin + nums[i]);
            minsum = Math.min(minsum, curmin);
            maxsum = Math.max(cursum, maxsum);
            i++;
        }
        if(maxsum<0){
            return maxsum;
        }
        int circularsum = totalsum-minsum;
        maxsum = Math.max(maxsum, circularsum);
        return maxsum;
    }
}