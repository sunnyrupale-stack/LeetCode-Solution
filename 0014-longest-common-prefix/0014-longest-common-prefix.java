class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i++){
            if(strs[i].length() < min){
                min = strs[i].length();
            }
        }
        int i = 0;
        while(i < min){
            for(String s:strs){
                String str = strs[0];
                if(s.charAt(i) != str.charAt(i))
                    return sb.toString();
            }
            sb.append(strs[0].charAt(i));
            i++;
        }
        return sb.toString();
    }
}