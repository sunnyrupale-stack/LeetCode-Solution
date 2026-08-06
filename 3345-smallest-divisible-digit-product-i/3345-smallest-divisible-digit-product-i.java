class Solution {
    public int smallestNumber(int n, int t) {

        while (true) {
            int v = n,pro = 1;
            while (v > 0) {
                int r = v % 10;
                pro *= r;
                v /= 10;
            }
            if (pro % t == 0)
                break;
            n++;
        }
        return n;
    }
}