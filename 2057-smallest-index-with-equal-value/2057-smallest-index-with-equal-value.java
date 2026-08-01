class Solution {
    public int smallestEqual(int[] nums) {
       int count=-1;
       for(int i=0;i<nums.length;i++){
        int dig=i%10;
        if(dig==nums[i]){
            count=i;
            break;
        }
       }
    return count;
    }
}