package december_2_week.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class Main {
    static int row;
    static int col;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] info = str.split(" ");

        col = Integer.parseInt(info[0]);
        row = Integer.parseInt(info[1]);

        map = new int[col][row];

        for (int i = 0; i < col; i++) {
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < arr.length; j++) {
                map[i][j] = Integer.parseInt(arr[j]);
            }
        }
    //---------------------------초기설정--------------------------------


        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (map[i][j] == 0) {
                    BFS(i, j);
                }
            }
        }

        System.out.println(result);
    }

    private static void BFS(int x, int y) {
        visit = new boolean[col][row];
        LinkedList<Integer> qx = new LinkedList<>();
        LinkedList<Integer> qy = new LinkedList<>();
        visit[x][y] = true;
        qx.add(x);
        qy.add(y);
        int cnt = 0;

        while (!qx.isEmpty() && !qy.isEmpty()) {
            int size = qx.size();

            for (int s = 0; s < size; s++) {
                int nx = qx.poll();
                int ny = qy.poll();

                if (map[nx][ny] == 1) {
                    result = Math.max(result, cnt);
                    return;
                }

                for (int i = 0; i < 8; i++) {
                    int xx = nx + dx[i];
                    int yy = ny + dy[i];

                    if (xx >= 0 && xx < col && yy >= 0 && yy < row && !visit[xx][yy]) {
                        visit[xx][yy] = true;
                        qx.add(xx);
                        qy.add(yy);
                    }

                }
            }
            cnt++;
        }
    }

}