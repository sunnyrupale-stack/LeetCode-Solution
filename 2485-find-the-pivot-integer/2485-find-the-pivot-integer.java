class Solution {
    public int pivotInteger(int n) {
        if(n == 1) return 1;

        int[] prefix = new int[n];
        prefix[0] = 1;
        for(int i = 1; i < n ; i++){
            prefix[i] = prefix[i-1] + i+1;
        }

        for(int i = 0; i < n; i++){
            int Lsum = (i == 0)? 0: rangesum(prefix, 0, i-1);
            int Rsum = (i == n-1)? 0: rangesum(prefix, i+1, n - 1);
            if(Lsum == Rsum) return i+1;
        }
        return -1;
    }
    private int rangesum(int[] prefix,int L,int R){
        if(L == 0) return prefix[R];

        return prefix[R] - prefix[L-1];
    }
}