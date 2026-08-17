class Solution {
    public String removeDigit(String number, char digit) {
        String res="";
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==digit){
                StringBuilder sb=new StringBuilder(number);
                sb.deleteCharAt(i);
                String ans=sb.toString();

                if(res.equals("") || ans.compareTo(res)>0){
                    res=ans;
                }
            }
        }
        return res;
    }
}