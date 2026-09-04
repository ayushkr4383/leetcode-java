class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        int[] lps = new int[needle.length()];
        int len=0;
        int i=1;
        while(i<needle.length()){
            if(needle.charAt(len)==needle.charAt(i)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len>0){
                    len = lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        i=0;
        int j=0;
        while(i<haystack.length()){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            
            if(j==needle.length()){
                return i-j;
            }
        }   
            else{
                if(j>0){
                    j=lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
        return -1;
    }
}