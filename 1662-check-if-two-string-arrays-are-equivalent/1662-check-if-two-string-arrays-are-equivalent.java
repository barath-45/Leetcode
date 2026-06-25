class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(String x1:word1){
            sb1.append(x1);
        }
        for(String x2:word2){
            sb2.append(x2);
        }
        return sb1.toString().equals(sb2.toString());
    }
}