class Solution {
    public String removeDigit(String number, char digit) {
        String res="";
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==digit){
                StringBuilder sb=new StringBuilder(number);
                sb.deleteCharAt(i);
                String answer=sb.toString();

                if(res.equals("")|| answer.compareTo(res)>0)
                res=answer;
            }
        }
        return res;
    }
}