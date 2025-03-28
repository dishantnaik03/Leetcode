class Solution {
    public boolean isAnagram(String s, String t) {
        char[] st = s.toCharArray();
        Arrays.sort(st);
        char[] tt =  t.toCharArray();
        Arrays.sort(tt);

        return (new String(st)).equals(new String(tt));
    }
}