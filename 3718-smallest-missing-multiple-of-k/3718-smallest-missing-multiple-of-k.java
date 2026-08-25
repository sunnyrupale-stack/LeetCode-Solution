class Solution {
    public int missingMultiple(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],i);
            if(min > nums[i]) min = nums[i];
        }

        int i = 1;
        while(true){
            if(i % k == 0 && !map.containsKey(i)){
                break;
            }
            i++;
        }
        return i;
    }
}