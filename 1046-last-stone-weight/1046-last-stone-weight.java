class Solution {
    public int lastStoneWeight(int[] stones) {
       int a=stones.length;

       while(a > 1){
            Arrays.sort(stones);
            int fmax=stones[a-1];
            int smax=stones[a-2];
            a=a-2;
            if(fmax!=smax){
                stones[a]=Math.abs(smax-fmax);
                a++;
            }
       }
       if(a==0){
        return 0;
       }
       return stones[0];
    }
}