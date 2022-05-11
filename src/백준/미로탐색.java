package 백준;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로탐색 {
    static boolean[][] visit;
    static int [][] arr;
    static int n;
    static int m;
    static int [] dx={1,-1,0,0};
    static int [] dy={0,0,1,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        visit = new boolean[n][m];
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }
        BFS(0,0);
        System.out.println(arr[n-1][m-1]);
    }

    public static void BFS(int x,int y){
        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy=new LinkedList<>();
        qx.add(x);
        qy.add(y);

        while (!qy.isEmpty() &&!qx.isEmpty()){
            x=qx.poll();
            y=qy.poll();
            for (int i = 0; i < 4; i++) {
                int xx=x+dx[i];
                int yy=y+dy[i];
                visit[x][y]=true;
                if(xx>-1 && yy>-1 &&xx<n &&yy<m){
                    if(arr[xx][yy]==1 && !visit[xx][yy]){
                        qx.add(xx);
                        qy.add(yy);
                        arr[xx][yy]=arr[x][y]+1;
                    }
                }

            }

        }
    }
}

