class Solution {
    public String smallestPalindrome(String s) {
        int freq[]=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        char middle='a';
        for(int i=0;i<26;i++){
            if(freq[i]%2==1){
                middle=(char)(i+'a');
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            int par=freq[i]/2;
            for(int j=0;j<par;j++){
                sb.append((char)(i+'a'));
            }
        }
        String hf=sb.toString();
        String hfr=sb.reverse().toString();
        if(s.length()%2==1){
            return hf+middle+hfr;
        }
        return hf+hfr;
    }
}