package pkg15655;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private StringBuilder sb;
    private int n,r;
    private int[] arr;
    private boolean[] visit;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        arr = new int[n];
        visit = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(0,0);
        System.out.print(sb);
    }
    
    private void dfs(int depth, int index)
    {
        if(depth == r)
        {
            for(int i=0; i<n; i++)
            {
                if(visit[i])
                    sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
        }
        else
        {
            for(int i=index; i<n; i++)
            {
                if(visit[i])
                    continue;
                visit[i] = true;
                dfs(depth+1, i+1);
                visit[i] = false;
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        new Main().start();
    }    
}
