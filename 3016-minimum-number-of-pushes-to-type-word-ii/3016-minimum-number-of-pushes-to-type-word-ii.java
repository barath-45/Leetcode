class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:word.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Integer>list=new ArrayList<>(map.values());
        Collections.sort(list,Collections.reverseOrder());
        int collect=0;
        for(int i=0;i<list.size();i++){
            int mul=(i/8)+1;
            collect=collect+list.get(i)*mul;
        }
        return collect;
    }
}