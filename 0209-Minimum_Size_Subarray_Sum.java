class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j= i+1;
        int sum = nums[i];
        int length=0;
        int found=0;
        int shortlen=0;
        
       int found2 =0;
       if(nums[i]>=target){
        return 1;
       }
        while(j<nums.length && i<j){
            if(nums[j]>=target){
                return 1;
            }
            
            if(found2==0){
                sum = sum+nums[j];
                found2=1;
            }
            if(sum>=target){
                length = (j+1)-i;
                if(found==0){
                    shortlen = length;
                    found=1;
                }
                else{
                    shortlen = Math.min(shortlen, length);
                }
                sum = sum-nums[i];
                i++;
                if(sum>=target){
                    while(sum>=target && i<=j){
                        length = (j+1)-i;
                        shortlen = Math.min(shortlen, length);
                        sum = sum-nums[i];
                        i++;
                    }
                }
            }
            else{
                j++;
                found2 = 0;
            }
        }
        return shortlen;
    }
}