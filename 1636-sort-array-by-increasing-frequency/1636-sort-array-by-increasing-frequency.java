class Solution {
    public int[] frequencySort(int[] nums) {
      HashMap<Integer,Integer>map=new HashMap<>();
      for(int x:nums){
        map.put(x,map.getOrDefault(x,0)+1);
      }
      Integer[] arr=new Integer[nums.length];
      for(int i=0;i<nums.length;i++){
        arr[i]=nums[i];
      }
      Arrays.sort(arr,(a,b) -> {
        int fa=map.get(a);
        int fb=map.get(b);

        if(fa!=fb){
            return fa-fb;
        }
        return b-a;
      });
      for(int i=0;i<nums.length;i++){
        nums[i]=arr[i];
      }
      return nums;
    }
}