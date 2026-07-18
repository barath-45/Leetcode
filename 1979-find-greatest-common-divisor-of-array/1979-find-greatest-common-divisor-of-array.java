class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int small=nums[0];
        int big=nums[nums.length-1];
        int res=0;
        for(int i=1;i<=small;i++){
            if(big%i==0 && small%i==0){
                res=i;
            }
        }
        return res;
    }
}