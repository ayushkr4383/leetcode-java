class Solution {
    public int missingNumber(int[] nums) {
        int k=0;
        int n = nums.length;
        
        int sum = (n*(n+1))/2;
        for(int j=n-1;j>=0;j--){
            sum=sum-nums[j];
        }
        return sum;
    }
}