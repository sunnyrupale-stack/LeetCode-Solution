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
                if(s.charAt(i) != strs[0].charAt(i)){
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));
            i++;
        }
        return sb.toString();
    }
}