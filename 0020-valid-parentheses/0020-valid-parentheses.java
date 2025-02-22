class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if(s.length()%2!=0){
            return false;
        }
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            } else if(!(st.isEmpty()) && st.peek() == '(' && c==')'){
                st.pop();
            } else if(!(st.isEmpty()) && st.peek() == '[' && c==']'){
                st.pop();
            } else if(!(st.isEmpty()) && st.peek() == '{' && c=='}'){
                st.pop();
            }else{
                return false;
            }
        }
        if(st.isEmpty()){
            return true;
        } else if(st.peek()==']' || st.peek()=='}' || st.peek()==')'){
            return false;
        } else{
            return false;
        }
    }
}