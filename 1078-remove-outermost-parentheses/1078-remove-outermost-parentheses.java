class Solution {
    public String removeOuterParentheses(String s) {
        int x=0;
        String ans="";
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if (c == '('){
                if(x!=0)                {
                    ans+=c;
                }
                x++;

            } else if (c == ')'){                
                x--;
                if(x!=0){
                    ans+=c;
                }
            }
        }
        return ans;
    }
}