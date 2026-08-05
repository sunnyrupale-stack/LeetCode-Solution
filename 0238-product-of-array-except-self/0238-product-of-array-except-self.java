class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int pro = 1; // without zero in arr
        int zpro = 1; // with zero in arr
        int c = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0) {
                zpro *= nums[i]; 
            }
            pro *= nums[i];
            if(nums[i] == 0) c++;
        }
        
        if(c >= 2) return ans;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) {
                ans[i] = zpro;
                continue;
            }
            ans[i] = pro/nums[i];
        }

        return ans;
    }
}