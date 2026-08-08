class Solution {
    public int subarraySum(int[] nums, int k) {
        // int n = nums.length;
        // int[] prefix = new int[n];
        // prefix[0] = nums[0];

        // for(int i = 1; i < n; i++){
        //     prefix[i] = prefix[i-1] + nums[i];
        // }
        
        // for(int i = 0; i < n; i++){
        //     int sum = prefix[i] - k;
        // }

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