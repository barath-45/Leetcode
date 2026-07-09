class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
            ch=Character.toLowerCase(ch);
                sb.append(ch);
        }
        }
        String sb1=sb.toString();
        String rev=sb.reverse().toString();
        return sb1.equals(rev);  

    }
}