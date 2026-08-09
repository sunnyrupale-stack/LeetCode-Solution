class Solution {
    public int subarraySum(int[] nums, int k) {
        // int n = nums.length;
        // int[] prefix = new int[n];
        // prefix[0] = nums[0];

        // for(int i = 1; i < n; i++){
        //     prefix[i] = prefix[i-1] + nums[i];
        // }
        // Map<Integer,Integer> m = new HashMap<>();
        // int count = 0;
        // for(int i = 0; i < n; i++){
        //     if(prefix[i] == k) count++;

        //     if(m.containsKey(prefix[i] - k)){
        //         count++;
        //     }
        //     m.put(prefix[i],i);
        // }
        // return count++;

        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}