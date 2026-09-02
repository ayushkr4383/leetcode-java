class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i,j,temp;
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
 
    }
}