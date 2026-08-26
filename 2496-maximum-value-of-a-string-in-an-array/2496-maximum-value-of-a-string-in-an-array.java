class Solution {
    public int maximumValue(String[] strs) {
        int max=0;
       for(String x:strs){
            boolean dig=true;
             for(char ch:x.toCharArray()){
                if(ch < '0' || ch > '9'){
                    dig=false;
                    break;
                }
             }
             int val;
             if(dig){
                val=Integer.parseInt(x);
             }else{
                val=x.length();
             }
             if(val > max){
                max=val;
             }
       }
       return max; 
    }
}