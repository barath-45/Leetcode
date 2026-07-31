class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int []arr=new int[nums.length];
        int right=nums.length-1;
        int pos=nums.length-1;
        while(left<=right){
            int ls=nums[left]*nums[left];
            int rs=nums[right]*nums[right];

            if(ls>rs){
                arr[pos]=ls;
                left++;
            }else{
                arr[pos]=rs;
                right--;
            }
            pos--;
        }
        return arr;
    }
}