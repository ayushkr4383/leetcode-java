class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftarr = new int[n];
        int[] rightarr = new int[n];
        leftarr[0] = 1;
        rightarr[n-1] = 1;
        int i=0;
        for(i=1;i<n;i++){
            leftarr[i] = leftarr[i-1]*nums[i-1];
        }
        for(i=n-2;i<=0;i++){
            rightarr[i] = rightarr[i+1]*nums[i+1];
        }
        for(i=0;i<n;i++){
            nums[i] = leftarr[i]*rightarr[i];
        }
        return nums;
    }
}