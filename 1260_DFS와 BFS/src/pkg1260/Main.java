package pkg1260;

import java.io.*;
import java.util.*;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private StringBuilder sb;
    private int n,m,v;
    private int[][] grid;
    private boolean[] visit;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        
        grid = new int[n][n];
        visit = new boolean[n];
        for(int i=0; i<m; i++)
        {
            st = new StringTokenizer(br.readLine());
            int dot1 = Integer.parseInt(st.nextToken())-1;
            int dot2 = Integer.parseInt(st.nextToken())-1;
            grid[dot1][dot2] = 1;
            grid[dot2][dot1] = 1;
        }
        dfs(v-1);
        for(int i=0; i<n; i++)
        {
            visit[i] = false;
        }
        sb.append("\n");
        bfs(v-1);
        System.out.println(sb);
    }
    private void dfs(int index)
    {
        sb.append(index+1 +" ");
        visit[index] = true;
        for(int i=0; i<n; i++)
        {
            if(!visit[i] && grid[index][i] == 1)
            {
                dfs(i);
            }
        }
        //visit[index] = false;
    }
    private void bfs(int index)
    {
        Queue<Integer> q = new LinkedList<Integer>();
        
        q.add(index);
        
        visit[index] = true;
        sb.append(index+1+" ");
        while(!q.isEmpty())
        {
            int nextIndex = q.poll();
            
            for(int i=0; i<n; i++)
            {
                if(!visit[i] && grid[nextIndex][i] == 1)
                {
                    q.add(i);
                    visit[i] = true;
                    sb.append(i+1+" ");
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
