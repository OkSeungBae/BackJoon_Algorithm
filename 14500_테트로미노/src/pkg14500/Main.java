
package pkg14500;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private BufferedReader br;
    private StringTokenizer st;
    private int row, col;
    private int[][] grid;
    private int[][] checkGrid;
    private int[] vx = {1,-1,0,0};
    private int[] vy = {0,0,1,-1};
    private int max=0;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        grid = new int[row][col];
        checkGrid = new int[row][col];
        for(int i=0; i<row; i++)
        {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<col; j++)
            {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(checkGrid[i][j] == 0)
                {
                    checkGrid[i][j] = 1;
                    dfs(j,i,grid[i][j]);
                    checkGrid[i][j] = 1;
                    exceptionBlock(j,i,grid[i][j]);
                }
            }
        }
        System.out.println(max);
    }
    private void exceptionBlock(int x, int y, int value)
    {
        int sum;
        int nextX=0, nextY=0;
        //빠큐모양 블록만 따로 해야겠다
        for(int i=0; i<4; i++)
        {
            sum = value;
            for(int j=0; j<4; j++)
            {
                if(i==j)
                    continue;
                nextX = x + vx[j];
                nextY = y + vy[j];
                if(nextX < col && 0 <= nextX
                        && nextY < row && 0 <= nextY
                        && checkGrid[nextY][nextX] == 0)
                {
                    sum += grid[nextY][nextX];
                    checkGrid[nextY][nextX] = 1;
                }
            }
            max = Math.max(max , sum);
            for(int j=0; j<4; j++)
            {
                if(i==j)
                    continue;
                nextX = x + vx[j];
                nextY = y + vy[j];
                if(nextX < col && 0 <= nextX
                        && nextY < row && 0 <= nextY
                        && checkGrid[nextY][nextX] == 1)
                {
                    checkGrid[nextY][nextX] = 0;
                }
            }
        }
        checkGrid[y][x] = 0;
    }
    private void dfs(int x, int y,int value)
    {
        if(checkGrid[y][x]==4)
        {
            max = Math.max(max, value);
            checkGrid[y][x] = 0;
            return ;
        }
        int nextX, nextY;
        for(int i=0; i<4; i++)
        {
            nextX = x + vx[i];
            nextY = y + vy[i];
            if(nextX < col && 0 <= nextX
                    && nextY < row && 0 <= nextY
                    && checkGrid[nextY][nextX] == 0)
            {
                
                checkGrid[nextY][nextX] = checkGrid[y][x] +1;
                dfs(nextX, nextY, value + grid[nextY][nextX]);
            }
        }
        checkGrid[y][x] = 0;
    }
    
    public static void main(String[] args) throws IOException{
       new Main().start();
    }
    
}
