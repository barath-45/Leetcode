class Solution {
    public int countDigits(int num) {
        int count=0;
        int org=num;
        int res=0;
        if(org<10){
            return 1;
        }
        while(num>0){
            int dig=num%10;
        if(org%dig==0){
            count++;
        }
        num/=10;
        }
        return count;
        }
    }