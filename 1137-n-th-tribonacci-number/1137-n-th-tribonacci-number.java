class Solution {
    public int tribonacci(int n) {
       if(n==0){
        return 0;
       } else if(n==1){
        return n;
       }
       int[]tri=new int[n+1];
       tri[0]=0;
       tri[1]=1;
       tri[2]=1;
       for(int i=3;i<tri.length;i++){
        tri[i]=tri[i-1]+tri[i-2]+tri[i-3];
       }
       return tri[n];
    }
}