class Solution {
    
    public int search(int[] nums, int target) {
        int n;
        n = nums.length;
        int high, low;
        low = 0;
        high = n-1;
        int pos = binarysearch(nums, low, high, target);
        return pos;
    }
    int binarysearch(int[] nums, int low, int high, int target){
            int mid = (low+high)/2;
            if(low>high){
                return -1;
            }
            if(target==nums[mid]){
                return mid;
            }
            if(nums[low]<=nums[mid]){
                if(target<nums[mid] && target>=nums[low]){
                    return binarysearch(nums, low, mid-1, target);
                }
                else{
                    return binarysearch(nums, mid+1, high, target);
                }
            }
            else{
                if(target>nums[mid] && target<=nums[high]){
                    return binarysearch(nums, mid+1, high, target);
                }
                else{
                    return binarysearch(nums, low,mid-1, target);
                }
            }
        }
    
}