class Solution {
    public long maxSum(int[] nums, int k, int mul) {

        Arrays.sort(nums);
        long sum=0;
        int cmul=mul;
        for(int i=nums.length-1;i>=nums.length-k;i--){
            long val=(long) nums[i]*cmul;
            
            if(val>nums[i]){
                sum+=val;
            }else{
                sum+=nums[i];
            }
            cmul--;
        }
        return sum;
    }
}