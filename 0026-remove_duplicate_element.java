class Solution {
    public int removeDuplicates(int[] nums) {
        int i ,j, n, k, m=0;
        n = nums.length;
        k = nums.length;
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;){
                if(nums[i]==nums[j]){
                    k--;
                    for(m = j;m<n-1;m++){
                        nums[m] = nums[m+1];
                    }
                    n--;
                }
                else{
                    j++;
                }
                
            }
        }
        return k;
    }
}