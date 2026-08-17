import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n;
        n = s.length();
        int i=0, j, ch;
        if(n==0){
            return true;
        }
        st.push(s.charAt(i));
        
        int top=0;
        
        char head = st.peek();
        for(i=1;i<n;i++){
            ch = s.charAt(i);
            if((top==-1)&&((ch==')')||(ch=='}')||(ch==']'))){
                    return false;
                }
            else if((head=='(' && ch == ')') || (head=='{' && ch== '}') || (head=='[' && ch==']')){
                if(st.isEmpty()==false){
                    st.pop();
                    if(st.isEmpty()==false){
                    head = st.peek();
                    }
                    
                    top--;
                }
                
                
               
            }
            else{
                if((ch!=')')&&(ch!='}')&&(ch!=']'))
                st.push(s.charAt(i));
                head = s.charAt(i);
                top++;
            }
            
        }
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
        
    }
}