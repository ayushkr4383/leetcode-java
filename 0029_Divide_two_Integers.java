class Solution {
    public int divide(int dividend, int divisor) {
        long div = dividend;
        long answer=0;
        long dvs = divisor;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean negative = (dividend < 0) != (divisor < 0);
        
        if(div>0){
            div = -div;

        }
        if(dvs>0){
            dvs = -dvs;
        }
        
        
        while(div<=dvs){
            long x=dvs;
            long quotient =1;
            while(x+x>=div){
            x = x+x;
            quotient = quotient+quotient;
            }
            div = div-x;
            answer = answer +quotient;
        }
        if(negative){
            answer = -answer;
        }
        return (int) answer;
    }
}