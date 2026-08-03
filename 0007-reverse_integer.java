class Solution {
    public int reverse(int x) {
        int i=0, rev=0, r;
        int ok = x;
        while(x!=0){
            r = x%10;
            if(rev<Integer.MIN_VALUE/10 || rev>Integer.MAX_VALUE/10){
                return 0;
            }
            rev = rev*10+r;
            x = x/10;
            }
        x = rev;
        
        
        return x;
    }
}