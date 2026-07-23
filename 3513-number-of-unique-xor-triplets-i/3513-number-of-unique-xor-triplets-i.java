class Solution {
    public int uniqueXorTriplets(int[] nums) {
     int a=nums.length;
     if(a<=2){
        return a;
     }
    int res=32-Integer.numberOfLeadingZeros(a);
    return 1<<res;
    }
}