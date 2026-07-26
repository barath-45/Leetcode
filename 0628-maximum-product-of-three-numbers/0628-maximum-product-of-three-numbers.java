class Solution {
    public int maximumProduct(int[] nums) {
       int fmax=Integer.MIN_VALUE;
       int smax=Integer.MIN_VALUE;
       int tmax=Integer.MIN_VALUE;
       int fmin=Integer.MAX_VALUE;
       int smin=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
       if(nums[i]>fmax){
        tmax=smax;
        smax=fmax;
        fmax=nums[i];
       }
       else if(nums[i]>smax){
        tmax=smax;
        smax=nums[i];
       }
       else if(nums[i]>tmax){
        tmax=nums[i];
       }
       if(nums[i]<fmin){
        smin=fmin;
        fmin=nums[i];
       }
       else if(nums[i]<smin){
        smin=nums[i];
       }
       }
       long ans=fmax*smax*tmax;
       long nans=fmin*smin*fmax;
        return (int) Math.max(ans,nans);
    }
}