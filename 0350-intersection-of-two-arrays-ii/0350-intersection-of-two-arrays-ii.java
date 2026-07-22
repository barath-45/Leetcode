class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
            HashMap<Integer,Integer>map1=new HashMap<>();
            for(int x:nums1){
                map1.put(x,map1.getOrDefault(x,0)+1);
            }
            List<Integer>map2=new ArrayList<>();
            for(int y:nums2){
                if(map1.getOrDefault(y,0)>0){
                    map2.add(y);
                     map1.put(y, map1.get(y) - 1);
                }
            }
            int res[]=new int[map2.size()];
            for(int i=0;i<res.length;i++){
                res[i]=map2.get(i);
            }
            return res;
    }
}