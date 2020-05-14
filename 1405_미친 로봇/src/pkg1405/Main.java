package pkg1405;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int n, east, west, south, north;
    
    private int vx[] = {1,-1,0,0};   //E,W,S,N 순
    private int vy[] = {0,0,1,-1};   //E,W,S,N 순
    
    private double prov[];
    
    private boolean[][] grid;
    private int start = 14;     //grid의 중심점
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());       //14보다 작거나 같은 자연수
        east = Integer.parseInt(st.nextToken());        //모든 확률은 0 보다 크고 100보다 작은 자연수
        west = Integer.parseInt(st.nextToken());
        south = Integer.parseInt(st.nextToken());
        north = Integer.parseInt(st.nextToken());
        
        prov = new double[4];
        
        prov[0] = east*0.01;
        prov[1] = west*0.01;
        prov[2] = south*0.01;
        prov[3] = north*0.01;
        
        grid = new boolean[29][29];     //grid할당
        
        System.out.println(dfs(start, start, n));
    }
    
    private double dfs(int x, int y, int n)
    {
        int nextX, nextY;
        double percentage=0;       //확률
        
        if(grid[y][x])
            return 0;
        else if(n == 0)
            return 1;
        else
        {
            grid[y][x] = true;
            for(int i=0; i<4; i++)
            {
                nextX = x+vx[i];
                nextY = y+vy[i];
                percentage += ( dfs(nextX, nextY, n-1) * prov[i] );
            }
            grid[y][x] = false;
        }
        return percentage;
    }
    
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
