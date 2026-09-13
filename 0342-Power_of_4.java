class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0 || n<0){
            return false;
        }
        if(n==1){
            return true;
        }
        int cube=1;
        boolean boo = powerofthree(n, cube);
        return boo;
    }
    boolean powerofthree(int n, int cube){
        long num = (long)Math.pow(4, cube);
        if(num>n){
            return false;
        }
        if(num==n){
            return true;
        }
        else{
            return powerofthree(n, cube+1);
        }
    }
}