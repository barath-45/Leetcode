class Solution {
    public int findNumbers(int[] nums) {
      int count=0;
        for(int x:nums){
              int dig=0;
            while(x>0){
                dig++;
                x=x/10;
            }
        if(dig%2==0){
         count++;
        }
        }
        return count;
    }
}