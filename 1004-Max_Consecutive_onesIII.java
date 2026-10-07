class Solution {
    public int longestOnes(int[] nums, int k) {
        int curlength=0;
        int maxlength =0;
        int m = k;
        int first=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==1){
                if(curlength==0){
                    first = i;
                }
                curlength++;
                maxlength = Math.max(curlength, maxlength);
            }
            else{
                if(m>0){
                    if(curlength==0){
                        first = i;
                    }
                    curlength++;
                    maxlength = Math.max(curlength, maxlength);
                    m--;
                }
                else{
                   while(m==0){
                    if(nums[first]==1){
                        first++;
                        curlength--;
                    }
                    else{
                        first++;
                        curlength--;
                        m++;
                    }
                }
                curlength++;
                maxlength = Math.max(curlength,  maxlength);
                m--;
                    }
                    
                }
            
        }
        return maxlength;
    }
}