class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int L = 0,max = 0;

        for(int R = 0; R < s.length(); R++){
            char ch = s.charAt(R);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.get(ch) > 1){
                char remove = s.charAt(L);
                if(map.get(remove) > 1){
                    map.put(remove,map.get(remove)-1);
                }else{
                    map.remove(remove);
                }
                L++;
            }
            int len = R - L + 1;
            if(max < len) max = len;
        }
        return max;
    }
}