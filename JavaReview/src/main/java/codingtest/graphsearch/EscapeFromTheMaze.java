package codingtest.graphsearch;

import java.util.*;
import java.awt.Point;

public class EscapeFromTheMaze {
    public static int[][] maze = new int[201][201];
    public static int n, m;
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static int bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y));

        while(!q.isEmpty()) {
            Point c = q.poll();
            int qx = c.x;
            int qy = c.y;

            for (int i = 0; i < 4; i++) {
                if (qx + dx[i] >= 0 && qx + dx[i] < n && qy + dy[i] >= 0 && qy + dy[i] < m && maze[qx + dx[i]][qy + dy[i]] == 1) {
                    maze[qx + dx[i]][qy + dy[i]] = maze[qx][qy] + 1;
                    q.add(new Point(qx + dx[i], qy + dy[i]));
                }
            }
        }

        return maze[n - 1][m - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String mazeInfo = sc.nextLine();
            for (int j = 0; j < m; j++) {
                maze[i][j] = mazeInfo.charAt(j) - '0';
            }
        }

        System.out.println(bfs(0,0));
    }
}
