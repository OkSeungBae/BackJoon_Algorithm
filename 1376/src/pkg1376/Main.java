
package pkg1376;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    private BufferedReader br;
    private StringTokenizer st;
    private int n,m;
    private int[][] grid;
    private boolean[] visit;
    private int count=0;
    private StringBuilder sb;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        grid = new int[n][n];
        visit = new boolean[n];
        m = Integer.parseInt(st.nextToken());
        for(int i=0; i<m; i++)
        {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken())-1;
            int second = Integer.parseInt(st.nextToken())-1;
            grid[first][second] = 1;
            grid[second][first] = 1;
        }
        sb = new StringBuilder();
        msFS(0);
        System.out.print(sb);
    }
    private void msFS(int start)
    {
        sb.append((start+1) + " ");
        count=0;
        visit[start] = true;
        //check
        for(int i=0; i<n; i++)
        {
            if( !visit[i] && grid[start][i] == 1)
            {
                count++;
            }
        }
        if(count % 2 == 0)
        {
            //짝수 이면
            for(int i=0; i<n; i++)
            {
                if( !visit[i] && grid[start][i] == 1)
                {
                    msFS(i);
                }
            }
        }
        else
        {
            //홀수 이면
            int temp = 1;
            count = count/2+1;
            for(int i=0; i<n; i++)
            {
                if( !visit[i] && grid[start][i] == 1 && temp==count)
                {
                    msFS(i);
                }
                else if( !visit[i] && grid[start][i] == 1)
                {
                    temp++;
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
       new Main().start();
    }  
}
