class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==0) {
            return -1;
        }
        int lsum=0,rsum=0;
        for(int i=0;i<nums.length;i++){
            rsum=rsum+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            rsum=rsum-nums[i];
            if(rsum==lsum){
                return i;
            }
            lsum=lsum+nums[i];
        }
        return -1;
    }
}