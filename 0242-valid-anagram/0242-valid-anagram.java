class Solution {
    public boolean isAnagram(String s, String t) {
        int comp[]=new int[26];
        if (s.length() != t.length()) return false;
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            comp[ch-'a']++ ; 

        }       
        for(int i=0;i<t.length();i++){
        
            comp[t.charAt(i)-'a']-- ; 
        
        }
        for(int i=0;i<26;i++)
        {
            if(comp[i]>0)
            return false;
        }
        return true;
    }
}