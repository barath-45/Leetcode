class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[]ch1=jewels.toCharArray();
        char[]ch2=stones.toCharArray();
        HashSet<Character>set=new HashSet<>();
        for(char x:ch1){
            set.add(x);
        }
        int count=0;
        for(char y:ch2){
            if(set.contains(y))
            count++;
        }
        return count;
    }
}