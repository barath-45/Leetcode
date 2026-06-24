class Solution {
    public int[] twoSum(int[] nums, int target) {
     int a=nums.length;
     int res[]=new int[2];
     for(int i=0;i<a;i++){
        for(int j=i+1;j<a;j++){
            if(nums[i]+nums[j]==target){
                res[0]=i;
                res[1]=j;
            }
        }
     }
     return res;   
    }
}