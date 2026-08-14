class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> set = new HashSet<>();
        int i=0, max = 0;
        int n = 0, left=0;
        int len = s.length();
        for(i=0;i<len;i++){
            if(set.contains(s.charAt(i))){
                
                while(s.charAt(left)!=s.charAt(i)){
                    set.remove(s.charAt(left));
                    left++;
                }
                
                set.remove(s.charAt(left));
                left++;
                set.add(s.charAt(i));
            }
            else{
                set.add(s.charAt(i));
                
            }
            if(max<set.size()){
                    max = set.size();
                }
           
            
        }
        return max;
    }

}