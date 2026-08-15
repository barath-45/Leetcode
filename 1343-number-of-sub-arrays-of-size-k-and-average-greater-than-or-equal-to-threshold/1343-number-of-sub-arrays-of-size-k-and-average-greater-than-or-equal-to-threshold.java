class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int a1=arr.length;
        int left=0;
        int right=k-1;
        int csum=0;
        int count=0;
        for(int i=0;i<=right;i++){
            csum=csum+arr[i];
        }
        if(csum/k >=threshold){
            count++;
        }
        while(right<a1-1){
            csum=csum-arr[left];
            left++;
            right++;
            csum=csum+arr[right];
            if(csum/k>=threshold){
            count++;
            }
        }
        return count;
    }
}