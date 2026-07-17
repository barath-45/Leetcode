class Solution {
    public boolean validDigit(int n, int x) {
        int temp=n;
        boolean found=false;
        int firstdigit=0;
        while(temp>0){
            firstdigit=temp%10;
            if(firstdigit==x){
                found= true;
            }
            temp=temp/10;
        }
        if(firstdigit==x) found= false;
        return found;
    }
}