import java.util.Arrays;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestsum=0;
        int closestdiff=0;
        int found=0;
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==target){
                    return sum;
                }
                int diff = Math.abs(sum-target);
                if(found==0){
                    closestdiff=diff;
                    closestsum = sum;
                    found=1;
                }
                if(sum<target){
                    j++;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                }
                else if(sum>target){
                    k--;
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }
                
                if(closestdiff>diff){
                    closestdiff = diff;
                    closestsum = sum;
                }

            }
        }
        return closestsum;
    }
}