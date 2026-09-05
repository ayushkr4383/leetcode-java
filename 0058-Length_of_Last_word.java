class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int i=n-1;
        int k=0;
        if(n==1){
            return 1;
        }
        while(Character.isLetter(s.charAt(i))==false){
            i--;
        }
        while(i>-1 && Character.isLetter(s.charAt(i))==true){
            i--;
            k++;
        }
        return k;
    }
}