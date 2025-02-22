class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        String a = "";
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                st.pop();


            } else {
                st.push(c);
            }
        }
        while (!st.isEmpty()){
            a = st.pop() + a;
        }
        return a;
    }
}