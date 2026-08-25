class Solution {
    public boolean checkDivisibility(int n) {
        int t = n,sum = 0,pro = 1;
        while(t > 0){
            int r = t % 10;
            sum += r;
            pro *= r;
            t /= 10;
        }
        return (n % (sum + pro) == 0);
    }
}