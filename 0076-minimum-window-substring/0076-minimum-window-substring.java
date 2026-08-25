class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> tmap = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char add = t.charAt(i);
            tmap.put(add, tmap.getOrDefault(add, 0) + 1);
        }

        int L = 0, minlen = Integer.MAX_VALUE, unique = tmap.size(), start = -1;
        for (int R = 0; R < s.length(); R++) {
            char ch = s.charAt(R);
            if (tmap.containsKey(ch)) {
                tmap.put(ch, tmap.get(ch) - 1);

                if (tmap.get(ch) == 0) {
                    unique--;
                }
            }

            while (unique == 0) {
                int len = R - L + 1;
                if (minlen > len) {
                    minlen = len;
                    start = L;
                }
                ch = s.charAt(L);
                if (tmap.containsKey(ch)) {
                    tmap.put(ch, tmap.get(ch) + 1);

                    if (tmap.get(ch) > 0) {
                        unique++;
                    }
                }
                L++;
            }
        }
        if(start == -1) return "";

        return s.substring(start,start+minlen);
    }
}