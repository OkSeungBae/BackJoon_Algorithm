
package pkg2206;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    private BufferedReader br;
    private StringTokenizer st;
    private int row,col;
    private int[][] grid;
    private int[][] gridInt;
    private int[] vx = {1,-1,0,0};
    private int[] vy = {0,0,1,-1};
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        grid = new int[row][col];
        gridInt = new int[row][col];
        for(int i=0; i<row; i++)
        {
            String line = br.readLine();
            for(int j=0; j<col; j++)
            {
                grid[i][j] = line.charAt(j) - '0';
            }
        }
        //벽을 부수지 않고 햇을 경우
        int min = 1000000;
        if(bfs() != 0)
        {
            min = Math.min(min, bfs());
        }
        init();
        //벽을 발견하면 하나 부순다
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(grid[i][j] == 1)
                {
                    grid[i][j] = 0;
                    if(bfs() != 0)
                    {
                        min = Math.min(min, bfs());
                    }
                    init();
                    grid[i][j] = 1;
                }
            }
        }
        if(min == 10000000)
        {
            System.out.println(-1);
        }
        else
            System.out.println(min);
    }
    private void init()
    {
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(grid[i][j]==-1)
                {
                    grid[i][j] = 0;
                }
                gridInt[i][j] = 0;
            }
        }
    }
    private int bfs()
    {
        gridInt[0][0] = 1;
        Queue<Integer> qx = new LinkedList<Integer>();
        Queue<Integer> qy = new LinkedList<Integer>();
        qx.add(0);
        qy.add(0);
        int x,y,nextX,nextY;
        while(!qx.isEmpty())
        {
            x = qx.poll();
            y = qy.poll();
            for(int i=0; i<4; i++)
            {
                nextX = x + vx[i];
                nextY = y + vy[i];
                if(nextX<col && 0 <= nextX
                        && nextY < row && 0 <= nextY
                        && grid[nextY][nextX] == 0)
                {
                    grid[nextY][nextX] = -1;
                    gridInt[nextY][nextX] = gridInt[y][x] + 1;
                    qx.add(nextX);
                    qy.add(nextY);
                }
            }
        }
        return gridInt[row-1][col-1];
    }
    public static void main(String[] args) throws IOException{
        Main main = new Main();
        main.start();
    }
}
