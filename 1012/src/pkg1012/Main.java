package pkg1012;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private StringBuilder sb;
    private int testCase;
    private int m,n,k;
    private int[][] grid;
    private int[] vx = {-1, 0, 1, 0};
    private int[] vy = {0, -1, 0, 1};
    private int count;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
        testCase = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<testCase; i++)
        {
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            
            grid = new int[n][m];
            for(int j=0; j<k; j++)
            {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                grid[y][x] = 1;
            }
            solution();
            sb.append(count+"\n");
        }
        System.out.print(sb);
        /*for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }*/
    }
    private void solution()
    {
        count=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(grid[i][j]==1)
                {
                    bfs(j,i);
                    count++;
                }
            }
        }
    }
    private void bfs(int x, int y)
    {
        Queue<Integer> xq = new LinkedList<Integer>();
        Queue<Integer> yq = new LinkedList<Integer>();
        
        
        grid[y][x] = 2;
        xq.add(x);
        yq.add(y);
        
        while(!xq.isEmpty())
        {
            int pollX = xq.poll();
            int pollY = yq.poll();
            for(int i=0; i<4; i++)
            {
                int nextX = pollX + vx[i];
                int nextY = pollY + vy[i];
                if(nextX >= 0 && nextY >= 0 && nextX < m && nextY < n && grid[nextY][nextX] == 1)
                {
                    grid[nextY][nextX] = 2;
                    xq.add(nextX);
                    yq.add(nextY);
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
    
}
