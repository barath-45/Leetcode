class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb=new StringBuilder();
        char []arr=address.toCharArray();
        for(char x:arr){
          if(x=='.'){
            sb.append("[.]");
          }else{
            sb.append(x);
          }
        }
        return sb.toString();
    }
}