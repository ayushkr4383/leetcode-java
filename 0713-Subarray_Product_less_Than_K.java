class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(nums.length==0 || k<=1){
            return 0;
        }
        int i=0;
        long product = 1;
        int count=0;
        for(int j=0;j<nums.length;j++){
            product = product*nums[j];
            if(product>=k){
                while(product>=k && i<=j){
                    product = product/nums[i];
                    i++;
                }            
            }
            count = count+(j-i)+1;
        }
        return count;
    }
}