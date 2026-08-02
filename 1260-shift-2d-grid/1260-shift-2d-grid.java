class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int r = grid.length;
        int c = grid[0].length;
        int n = r * c;

        k %= n;

        List<List<Integer>> ans = new ArrayList<>();

        // Initialize answer grid
        for (int i = 0; i < r; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < c; j++) {
                row.add(0);
            }
            ans.add(row);
        }

        // Move every element to its new position
        for (int i = 0; i < n; i++) {

            int row = i / c;
            int col = i % c;

            int idx = (i + k) % n;

            int nrow = idx / c;
            int ncol = idx % c;

            ans.get(nrow).set(ncol, grid[row][col]);
        }

        return ans;
    }

}