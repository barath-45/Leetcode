class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int org=n;
        while(n!=0){
            int dig=n%10;
            sum=sum + dig;
            product=product * dig;
            n=n/10;
        }
        int res=sum+product;
        if(org % res==0){
            return true;
        }
        return false;
    }
}