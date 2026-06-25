class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
       int idx=s.lastIndexOf(" ");
       
       String ans=s.substring(idx+1);
       return ans.length();
    }
}