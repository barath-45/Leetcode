class Solution {
    public int maximumLengthSubstring(String s) {
        int[]arr=new int[26];
        int max=0;
        int st=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;

            while(arr[s.charAt(i)-'a']>2){
                arr[s.charAt(st)-'a']--;
                st++;
            }
            max = Math.max(max, i - st + 1);
        }
            return max;
        }
}