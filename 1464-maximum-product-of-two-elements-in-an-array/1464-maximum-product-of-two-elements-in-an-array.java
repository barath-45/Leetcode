class Solution {
    public int maxProduct(int[] nums) {
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
        if(nums[i]>fmax){
            smax=fmax;
            fmax=nums[i];
        }
        else if(nums[i]>smax){
            smax=nums[i];
        }
        }
        int ans1=fmax-1;
        int ans2=smax-1;
        int res=ans1*ans2;
        return res;
    }
}