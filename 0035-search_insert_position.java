class Solution {
    public int searchInsert(int[] nums, int target) {
        int low, high, n, k;
        n = nums.length;
        low = 0;
        high = n-1;
        k = binarysearch(nums, low, high, target);
        return k;
    }
    int binarysearch(int nums[], int low, int high, int target){
        int mid;
        mid = low+(high-low)/2;
        if(low>high){
            return low;

        }
        else if(nums[mid]>target){
            return binarysearch(nums, low, mid-1, target);
        }
        else if(nums[mid]==target){
            return mid;
        }
        else{
            return binarysearch(nums, mid+1, high, target);
        }
    }
    
   
}