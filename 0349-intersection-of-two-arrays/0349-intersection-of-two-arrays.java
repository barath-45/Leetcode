class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set1=new HashSet<>();
        for(int x:nums1){
            set1.add(x);
        }
        HashSet<Integer>set2=new HashSet<>();
        for(int y:nums2){
        if(set1.contains(y)){
            set2.add(y);
        }
    }
    return set2.stream().mapToInt(Integer::intValue).toArray();
    }
}