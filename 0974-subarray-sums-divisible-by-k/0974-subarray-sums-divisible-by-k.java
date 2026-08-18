class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0,ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int x:nums){
            sum += x;
            int mod = sum % k;
            if(mod < 0) mod = mod%k +k;
            if(map.containsKey(mod)){
                ans += map.get(mod);
            }
            map.put(mod,map.getOrDefault(mod,0)+1);
        }

        return ans;
    }
}