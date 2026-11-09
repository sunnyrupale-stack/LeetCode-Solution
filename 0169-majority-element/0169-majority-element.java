class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maxcount = 0;
        int fn = nums[0];
        int count = 0;
        int ans = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(fn == nums[i]){
                count++;
                if(maxcount < count){
                    maxcount = count;
                    ans = nums[i];
                }
            }
            else{
                fn = nums[i];
                count = 1;
            }
        }
        return ans;
    }
}