class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int n = nums.length,idx = 0;

        for(int i = 0; i < k; i++){
            while(!deque.isEmpty() && deque.peekLast() < nums[i]){
                deque.pollLast();
            }
            deque.offerLast(nums[i]);
        }
        
        int[] ans = new int[n-k+1];
        ans[idx++] = deque.peekFirst();

        for(int i = k; i < nums.length; i++){

            if(deque.peekFirst() == nums[i-k]) deque.pollFirst(); // removing first from the window

            while(!deque.isEmpty() && deque.peekLast() < nums[i]){ // adding in window
                deque.pollLast();
            }
            deque.offerLast(nums[i]);

            ans[idx++] = deque.peekFirst();// updating current answer
        }

        return ans;
    }
}