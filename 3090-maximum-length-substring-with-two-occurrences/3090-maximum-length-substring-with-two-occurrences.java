class Solution {
    public int maximumLengthSubstring(String s) {
        int maxlen = 0;
        int L = 0;
    
        int[] freq = new int[26];

        for(int R = 0; R < s.length(); R++){
            int current = s.charAt(R) - 'a';
            freq[current]++;

            while(freq[current] > 2){
                // c-a = 2
                int removed = s.charAt(L) - 'a';

                freq[removed]--;
                L++;
            }
            int count = R-L+1;
            if(maxlen < count) maxlen = count;
        }
        return maxlen;
    }
}