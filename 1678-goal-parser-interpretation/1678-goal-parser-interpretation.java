class Solution {
    public String interpret(String command) {
      StringBuilder sb=new StringBuilder();
      char[]wrd=command.toCharArray();
     for(int i=0;i<wrd.length;i++){
        if(wrd[i]=='G'){
            sb.append("G");
        }
        else if(wrd[i]=='('&& wrd[i+1]==')'){
            sb.append("o");
            i++;
        }
        else if(wrd[i]=='('&& wrd[i+1]=='a'){
            sb.append("al");
            i=i+3;
        }
     }
     return sb.toString();
    }
}