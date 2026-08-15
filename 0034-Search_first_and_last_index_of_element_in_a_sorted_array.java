class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low, high, n;
        int k1=-1, k2=-1;
        n = nums.length;
        low = 0;
        high = n-1;
        int[] arr = new int[2];
        k1 = binarysearch(nums, low, high, target, true);
       
        if(k1==-1){
            arr[0] = k1;
            arr[1] = -1;
            return arr;
        }

        low = k1+1;
        high = n-1;
        k2 = binarysearch(nums, low, high, target, false);
        
        if(k2 == -1){
            arr[0] = k1;
            arr[1] = k1;
            return arr;
        }
        else{
            arr[0] = k1;
            arr[1] = k2;
            return arr;
        }
       
        
    }
    int binarysearch(int[] nums, int low, int high, int target, boolean first){
        int mid;
        mid = low+(high-low)/2;
        if(low>high){
            return -1;  
        }
        else if(nums[mid]>target){
            return binarysearch(nums, low, mid-1, target, first);
        }
        else if(nums[mid]==target){
            if(first==true){
                int k = binarysearch(nums, low, mid-1, target, true);
                    if(k==-1){
                        return mid;
                    }
                    else{
                        return k;
                    }
                
            }
            else{
                int k = binarysearch(nums, mid+1, high, target, false);
                    if(k==-1){
                        return mid;
                    }
                    else{
                        return k;
                    }
                
            }
        }
        else{
            return binarysearch(nums, mid+1, high, target, first);
        }

    }
}