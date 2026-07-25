class Solution {
    public int maxProduct(int n) {
   String s=String.valueOf(n);
   int a=s.length();
   int res=0;
   for(int i=0;i<a;i++){
    for(int j=i+1;j<a;j++){
        int fd=s.charAt(i)-'0';
        int ld=s.charAt(j)-'0';
        int newproduct=fd*ld;

        res=Math.max(res,newproduct);
    }
   }
   return res;
    }
}