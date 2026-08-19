class Solution {
    public int[] twoSum(int[] nums, int target) {

        int i = 0,j = nums.length-1;
        while(i < j){
            if(nums[i] + nums[j] == target){
                return new int[]{i+1,j+1};
            }
            if( nums[i]+nums[j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[] {i+1,j+1};
    }

    private int[] sum(int[] nums,int target){
        int i = 0, j = nums.length-1;

        while(i < j){
            int t = target - nums[i];
            
            if(nums[i] + nums[j] == t) break;
            
            if(nums[i] + nums[j] > t) j--;

            if(nums[i] + nums[j] < t) i++;
        }
        return new int[] {i+1,j+1};
    }
}