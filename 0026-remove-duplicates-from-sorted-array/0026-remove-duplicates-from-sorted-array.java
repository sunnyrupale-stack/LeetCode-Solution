class Solution {
    public int removeDuplicates(int[] nums) {
        
        int j = 0;
        int c = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
                c++;
            }
        }
        return c;
    }
}