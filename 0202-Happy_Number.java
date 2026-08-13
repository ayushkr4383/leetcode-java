class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int r=0, t=0;
        int x = 0;
        int found = 0;
        while(n!=1){
            while(n>0){
                r = n%10;
                n = n/10;
                x = x+(r*r);
            }
            n = x;
            x = 0;
            if(set.contains(n)){
                found = 1;
            }
            else{
                set.add(n);
            }
            if(found==1){
                return false;
            }
        }
        return true;
    }
}