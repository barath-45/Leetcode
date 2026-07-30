class Solution {
    public int[] sortedSquares(int[] nums) {
       int a=nums.length;
       int[]arr=new int[a];
       int left=0,right=a-1;
       int pos=0;
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
        pos++;
       }
       int i=0;
       int j=a-1;
       while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
       }
       return arr;
    }
}