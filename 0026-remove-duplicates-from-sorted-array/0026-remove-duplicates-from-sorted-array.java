class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
     HashSet<Integer> set=new HashSet<>();
     for(int i=0;i<nums.length;i++){
     if(!set.contains(nums[i])){
     set.add(nums[i]);
     nums[count]=nums[i];
     count++;

    }
     }
    return count;
}
}