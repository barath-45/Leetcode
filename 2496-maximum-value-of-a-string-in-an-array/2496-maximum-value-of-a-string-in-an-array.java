class Solution {
    public int maximumValue(String[] strs) {
        int max=0;
        for(String x:strs){
            boolean pg=true;
            for(char ch:x.toCharArray()){
                if(ch < '0' || ch > '9'){
                    pg=false;
                    break;
                }
            }
            int value;
            if(pg){
                value=Integer.parseInt(x);
            }
            else{
                value=x.length();
            }
            if(value > max){
                max = value;
            }
        }
        return max;
    }
}