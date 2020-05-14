package pkg2573;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private BufferedReader br;
    private StringTokenizer st;
    private int row,col,max=0;
    private int[][] check;
    private int[][] map;
    private int[][] calc;
    private int[] vx = {1,-1,0,0};
    private int[] vy = {0,0,1,-1};
    private int count=1;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        map = new int[row][col];
        calc = new int[row][col];
        check = new int[row][col];
        for(int i=0; i<row; i++)
        {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<col; j++)
            {
                map[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, map[i][j]);
            }
        }
        //시작하자 마자 검사
        for(int i=0; i<row; i++)
            {
                for(int j=0; j<col; j++)
                {
                    if(map[i][j] != 0 && check[i][j] == 0)
                    {
                        dfs(j,i);
                        count++;
                    }
                }
            }
        if(count>2)
        {
            System.out.println(0);
            return ;
        }
        for(int year=0; year<max; year++)
        {
            for(int i=0; i<row; i++)
            {
                for(int j=0; j<col; j++)
                {
                    if(map[i][j] != 0)
                    {   
                        oneYearLater(j,i);
                    }
                }
            }
            goCalc();
            for(int i=0; i<row; i++)
            {
                for(int j=0; j<col; j++)
                {
                    if(map[i][j] != 0 && check[i][j] == 0)
                    {
                        dfs(j,i);
                        count++;
                    }
                }
            }
            if(count > 2)
            {
                System.out.println(year+1);
                return ;
            }
            else
                init();
        } 
        System.out.println(0);
    }
    private void init()
    {
        count = 1;
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                check[i][j] =0;
                calc[i][j] =0;
            }
        }
    }
    private void dfs(int x, int y)
    {
        check[y][x] = count;
        int nextX,nextY;
        for(int i=0; i<4; i++)
        {
            nextX = x+vx[i];
            nextY = y+vy[i];
            if(nextX < col && 0<=nextX
                    && nextY < row && 0<=nextY
                    && map[nextY][nextX] != 0
                    && check[nextY][nextX] == 0)
            {
                dfs(nextX, nextY);
            }
        }
    }
    private void goCalc()
    {
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                map[i][j] -= calc[i][j];
                if(map[i][j] < 0)
                {
                    map[i][j] = 0;
                }
            }
        }
    }
    private void oneYearLater(int x, int y)
    {
        int nextX, nextY;
        for(int i=0; i<4; i++)
        {
            nextX = x+vx[i];
            nextY = y+vy[i];
            if(nextX < col && 0<=nextX
                    && nextY < row && 0<=nextY
                    && map[nextY][nextX] == 0)
            {
                calc[y][x]++;
            }
        }
    }
    public static void main(String[] args) throws IOException{
        Main main = new Main();
        main.start();
    }  
}
