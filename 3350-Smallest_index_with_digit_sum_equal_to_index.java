class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==sumofdigits(nums[i])) return i;
        }
        return -1;
    }
    public int sumofdigits(int x){
        int sum=0, r=0;
        while(x>0){
            r = x%10;
            sum = sum+r;
            x = x/10;
        }
        return sum;
    }
}