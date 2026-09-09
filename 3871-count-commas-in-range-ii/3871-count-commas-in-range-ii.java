class Solution {
    public long countCommas(long n) {
       long a=n;
       long b=1000;
       long c=0;
       while(b<=a){
        c+=a-b+1;
        b=b*1000;
       }
       return c;
    }
}