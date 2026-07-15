
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int osum=0;
        int esum=0;
        for(int i=1;i<=n;i++){
            osum+=2*i-1;
        }
        for(int i=1;i<=n;i++){
            esum+=2*i;
        }
        int res=gcd(osum,esum);
        return res;
    }
    private int gcd(int a,int b){
        if (b ==0) return a;
        return gcd(b,a %b);
        }
}