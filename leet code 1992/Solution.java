import java.util.*;

class Solution {
    class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int[][] findFarmland(int[][] land) {
        Queue<Pair> q = new LinkedList<>();
        List<List<Integer>> al1 = new ArrayList<>();

        int n = land.length;
        int m = land[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (land[i][j] == 1) {
                    List<Integer> al = new ArrayList<>();
                    al.add(i);
                    al.add(j);
                    q.add(new Pair(i, j));
                    land[i][j] = 0;

                    int x = 0;
                    int y = 0;

                    while (q.size() > 0) {
                        Pair p = q.remove();
                        x = p.x;
                        y = p.y;

                        // right
                        if (p.y + 1 < m && land[p.x][p.y + 1] == 1) {
                            q.add(new Pair(p.x, (p.y + 1)));
                            land[x][y + 1] = 0;
                        }

                        // Down
                        if (p.x + 1 < n && land[p.x + 1][p.y] == 1) {
                            land[x + 1][y] = 0;
                            q.add(new Pair((p.x + 1), p.y));
                        }
                    }

                    al.add(x);
                    al.add(y);

                    al1.add(al);
                }
            }
        }

        if (al1.size() == 0) {
            return new int[0][0];
        }
        
        int rows = al1.size();
        int cols = al1.get(0).size();
        int[][] twoDArray = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            List<Integer> rowList = al1.get(i);
            for (int j = 0; j < cols; j++) {
                twoDArray[i][j] = rowList.get(j);
            }
        }

        return twoDArray;

    }
}
