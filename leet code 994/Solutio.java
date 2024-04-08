public class Solution {
    class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        int time = 0;
        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) fresh++;
                else if (grid[i][j] == 2) {
                    Pair p = new Pair(i, j);
                    q.add(p);
                }
            }
        }

        while (!q.isEmpty() && fresh > 0) {
            int s = q.size();
            boolean flag = false;

            for (int i = 0; i < s; i++) {
                Pair p = q.remove();
                int k = p.x;
                int l = p.y;

                // Check up
                if (k > 0 && grid[k - 1][l] == 1) {
                    grid[k - 1][l] = 2;
                    q.add(new Pair(k - 1, l));
                    fresh--;
                    flag = true;
                }

                // Check down
                if (k < n - 1 && grid[k + 1][l] == 1) {
                    grid[k + 1][l] = 2;
                    q.add(new Pair(k + 1, l));
                    fresh--;
                    flag = true;
                }

                // Check left
                if (l > 0 && grid[k][l - 1] == 1) {
                    grid[k][l - 1] = 2;
                    q.add(new Pair(k, l - 1));
                    fresh--;
                    flag = true;
                }

                // Check right
                if (l < m - 1 && grid[k][l + 1] == 1) {
                    grid[k][l + 1] = 2;
                    q.add(new Pair(k, l + 1));
                    fresh--;
                    flag = true;
                }
            }

            if (flag) time++;
        }

        if (fresh > 0) return -1;

        return time;
    }
}
