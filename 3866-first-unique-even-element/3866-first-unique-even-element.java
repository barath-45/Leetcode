class Solution {
    public int firstUniqueEven(int[] nums) {
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int x:nums){
        map.put(x,map.getOrDefault(x,0)+1);
    }
    for(int x1:nums){
        if(map.get(x1)==1 && x1%2==0){
            return x1;
        }
    }
    return -1;
    }
}