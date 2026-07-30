class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0, j, n, l, k;
        n = nums.length;
        k = nums.length;
        while(i<n){
            l = i;
            int found=0;
            if(nums[i]==val){
                k--;
                while(l<n-1){
                    if(l<n-1){
                        nums[l] = nums[l+1];
                        l++;
                        found=1;
                
                    }
                    
                }
                
                
                n--;
            }
            if(found==1){
                i=0;
            }
            else{
                i++;
            }
        }
       
        return k;


    }
}