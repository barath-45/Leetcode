class Solution {
    public String addStrings(String num1, String num2) {
       StringBuilder sb=new StringBuilder();
       int dig1=num1.length()-1;
       int dig2=num2.length()-1;
       int carry=0;

       while(dig1>=0 || dig2>=0 || carry!=0){
        int ans1= dig1>=0 ? num1.charAt(dig1)- '0':0;
        int ans2= dig2>=0 ? num2.charAt(dig2)- '0':0;
        int sum=ans1+ans2+carry;
        carry=sum/10;
        sb.append(sum%10);

        dig1--;
        dig2--;
       }
       return sb.reverse().toString();
    }
}