class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        int i, j, k, m, n;
        int arr[] = new int[2];
        k = nums.length;
        for(i=0;i<k-1;i++){
            for(j=i+1;j<k;j++){
                if(nums[i]+nums[j]==target){
                    arr = new int[]{i, j};
                }
            }
        }
        return arr;
    
    }
            
}
    

