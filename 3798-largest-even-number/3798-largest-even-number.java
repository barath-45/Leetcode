class Solution {
    public String largestEven(String s) {
       int a=s.length();
       while(a>0 && s.charAt(a-1)=='1'){
        a--;
       }
       return s.substring(0,a);
    }
}