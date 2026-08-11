class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        // int[] prefix = new int[n];
        // prefix[0] = nums[0];

        // for(int i = 1; i < n; i++){
        //     prefix[i] = prefix[i-1] + nums[i];
        // }
        int sum = 0,ans = 0;
        Map<Integer,Integer> m = new HashMap<>();
        m.put(0,1);
        for(int x : nums){
            sum += x;
            int diff = sum - k;
            if(m.containsKey(diff)){
                ans += m.get(diff);
            }
            m.put(sum,m.getOrDefault(sum,0)+1);
        }
        return ans;

        // int count = 0;
        // for(int i = 0; i < nums.length; i++){
        //     int sum = 0;
        //     for(int j = i; j < nums.length; j++){
        //         sum += nums[j];
        //         if(sum == k){
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
}