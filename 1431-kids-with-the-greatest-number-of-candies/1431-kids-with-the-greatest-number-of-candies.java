class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>br=new ArrayList<>();
        int max=candies[0];
        for(int arr:candies){
            max=Math.max(max,arr);
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                br.add(true);
            }else{
        br.add (false);
            }
        }
        return br;
    }
}