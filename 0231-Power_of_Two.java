class Solution {
    public boolean isPowerOfTwo(int n) {
        int sq=1;
        boolean boo = poweroftwo(n, sq);
        if(n==1){
            return true;
        }
        if(n==0){
            return false;
        }
        return boo;
        
    }
    boolean poweroftwo(int n, int sq){
            long num = (long)Math.pow(2, sq);
            if(num>n){
                return false;
            }
            
            if(num==n){
                return true;
            }
            else{
                return poweroftwo(n, sq+1);
            }
            
        }
}