class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length,sum = nums[0];
        if(n == 1) return nums[0] + 1;

        Map<Integer,Integer> m = new HashMap<>();
    
        for(int i = 0; i < n; i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(int i = 1; i < n; i++){
            if(nums[i] != nums[i - 1] + 1){
                break;
            }
            sum += nums[i];
        }
        for(int i = 0; i < n; i++){
            if(!m.containsKey(sum)) break;
            else sum++;
        }
        return sum;
    }
    
}