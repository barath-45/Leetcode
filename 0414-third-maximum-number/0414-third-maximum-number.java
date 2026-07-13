class Solution {
    public int thirdMax(int[] nums) {
       HashSet<Integer> set=new HashSet<>();
       for(int x:nums){
        set.add(x);
       }
       if(set.size()<3){
        int max=Integer.MIN_VALUE;
        for(int x:set){
            max=Math.max(x,max);
        }
        return max;
       }
       int fmax=Integer.MIN_VALUE;
       int smax=Integer.MIN_VALUE;
       int tmax=Integer.MIN_VALUE;
        for(int i:set){
            if(i>fmax){
                tmax=smax;
                smax=fmax;
                fmax=i;
            }
            else if(i>smax && i!=fmax){
                tmax=smax;
                smax=i;
            }
            else if(i>tmax && i!=smax && i!=fmax){
                tmax=i;
            }
        }
        return tmax;
    }
}