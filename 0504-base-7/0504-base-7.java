class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        boolean neg=num<0;
        int div=Math.abs(num);
        StringBuilder sb=new StringBuilder();
        while(div!=0){
            int dig=div%7;
            sb.append(dig);
            div=div/7;
        }
        if(neg){
            sb.append('-');
        }
        return sb.reverse().toString();
    }
}