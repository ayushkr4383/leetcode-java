class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        int i=0, j=len-1;
        
        while(i<=j){
            
            if(Character.isLetterOrDigit(s.charAt(i))==false){
                i++;
                continue;
            }
            else if(Character.isLetterOrDigit(s.charAt(j))==false){
                j--;
                continue;
            }
            if(Character.isLetterOrDigit(s.charAt(i))==true && Character.isLetterOrDigit(s.charAt(j))==true) {
                if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))){
                    i++;
                    j--;
                    if(i>=j){
                        return true;
                    }
                }
                else{
                    return false;
                }
                
            }
        }
        return true;
    }
}