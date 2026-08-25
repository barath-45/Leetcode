class Solution {
    public int searchInsert(int[] nums, int target) {
        int a=nums.length-1;
        int low=0;
        int high=a;
            while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}