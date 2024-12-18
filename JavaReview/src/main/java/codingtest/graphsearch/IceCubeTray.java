package codingtest.graphsearch;

import java.util.*;

public class IceCubeTray {
    public static int n, m;
    public static int[][] iceCubeTray = new int[1000][1000];
    public static boolean dfs(int x, int y){
        if (x < 0 || x >= n || y < 0 || y >= m) return false;

        if (iceCubeTray[x][y] == 0) {
            iceCubeTray[x][y] = 1;
            dfs(x + 1, y);
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String tray = sc.nextLine();
            for (int j = 0; j < m; j++) {
                iceCubeTray[i][j] = tray.charAt(j) - '0';
            }
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j)) result++;
            }
        }
        System.out.println(result);
    }
}
