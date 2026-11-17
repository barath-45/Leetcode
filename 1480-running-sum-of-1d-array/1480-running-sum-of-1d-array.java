class Solution {
    public int[] runningSum(int[] nums) {
        int a=nums.length;
        int[]res=new int[a];
        res[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            res[i]=nums[i]+res[i-1];
        }
        return res;
    }
}