class Solution {
    public int secondHighest(String s) {
        int largest=-1;
        int slargest=-1;
        char[]arr=s.toCharArray();
        for(int ch:arr){
            if(Character.isDigit(ch)){
                int num=ch-'0';
                if(num>largest){
                    slargest=largest;
                    largest=num;
                }
                else if(num>slargest && num!=largest){
                    slargest=num;
                }
            }
        }
        return slargest;
    }
}