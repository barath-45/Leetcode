class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean Even=false;
        boolean Odd=false;
        for(int x:nums1){
            if(x%2==0){
                Even=true;
            }else{
                Odd=true;
            }
        }
        return true;
    }
}