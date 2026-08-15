class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int a=nums.length;
        if(a<k){
            return 0;
        }
       int left=0;
       int right=k-1;
       int csum=0;
       double  maxsum=0;

       for(int i=0;i<=right;i++){
        csum=csum+nums[i];
       }
        maxsum=csum;
       while(right<a-1){
        csum=csum-nums[left];
        left++;
        right++;
        csum=csum+nums[right];
        maxsum=Math.max(maxsum,csum);
       }
        double ans=maxsum/k;
        return ans;
    }
}