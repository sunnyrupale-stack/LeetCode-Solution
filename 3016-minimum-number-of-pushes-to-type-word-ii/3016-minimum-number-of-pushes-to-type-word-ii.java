class Solution {
    public int minimumPushes(String word) {
        Map<Character,Integer> m = new HashMap<>();

        for(char ch:word.toCharArray()){
            m.put(ch,m.getOrDefault(ch,0)+1);
            // if(m.containsKey(ch)){
            //     int c = m.getValue(ch);
            //     m.put(ch,c+1);
            // }
            // else m.put(ch,1);
        }

        List<Integer> freq = new ArrayList<>(m.values());

         // Sort in descending order
        Collections.sort(freq, Collections.reverseOrder());
    
        int ans = 0;

        for (int i = 0; i < freq.size(); i++) {

            int pushes = i / 8 + 1;

            ans += freq.get(i) * pushes;
        }

        return ans;
    }
}