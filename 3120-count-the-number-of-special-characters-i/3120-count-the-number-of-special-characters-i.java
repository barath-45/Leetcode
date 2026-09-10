class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer>map=new HashMap<>();
        Set<Character> lower= new HashSet<>();
        for(char ch:word.toCharArray()){
            if(Character.isUpperCase(ch)){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }else{
            lower.add(ch);
     }
        }
        int val=0;
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
             if(lower.contains(Character.toLowerCase(entry.getKey()))){
                val++;
             }
        }
        return val;
    }
}