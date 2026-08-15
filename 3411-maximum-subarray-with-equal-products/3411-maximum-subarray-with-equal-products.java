class Solution {
    public int maxLength(int[] nums) {
        int max = 0;

        for (int L = 0; L < nums.length; L++) {
            int pro = 1;
            int gcd = 0;
            int lcm = 1;

            for (int R = L; R < nums.length; R++) {

                pro *= nums[R];

                gcd = getgcd(gcd, nums[R]);

                lcm = getlcm(lcm, nums[R]);

                if (pro == lcm * gcd) {
                    max = Math.max(max, R - L + 1);
                }

            }
        }

        return max;
    }

    private int getgcd(int a, int b) {
        if (b == 0)
            return a;

        return getgcd(b, a % b);
    }

    private int getlcm(int a, int b) {
        return a / getgcd(a, b) * b;
    }
}