class Solution {
    public int countSegments(String s) {
        String ans=s.strip();
        if(ans.length()<1){
            return 0;
        }
        return ans.split("\\s+").length;
    }
}