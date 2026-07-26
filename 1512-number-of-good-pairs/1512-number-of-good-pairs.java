class Solution {
    public int numIdenticalPairs(int[] nums) {
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int x:nums){
        map.put(x,map.getOrDefault(x,0)+1);
    }
    int res=0;
    for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        int key=entry.getValue();
        if(key>=2){
            res+=key*(key-1)/2;
        }
    } 
    return res; 
    }
}