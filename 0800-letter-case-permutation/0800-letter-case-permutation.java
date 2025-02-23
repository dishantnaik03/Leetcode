class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> output = new ArrayList<>();
        permutation(s.toCharArray(), 0, output);
        return output;
    }
    public void permutation(char[] ch, int i, List<String> output){
        if(i == ch.length){
            output.add(new String(ch));
            return ;
            
        }
        if(Character.isLetter(ch[i])){
            ch[i] = Character.toLowerCase(ch[i]);
            permutation(ch, i+1, output);

            ch[i] = Character.toUpperCase(ch[i]);
            permutation(ch, i+1, output);
        } else {
            permutation(ch, i+1, output);
        }
    }
    
}