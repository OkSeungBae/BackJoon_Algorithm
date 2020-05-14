package pkg15650;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private BufferedWriter bw;
    private StringBuilder sb;
    private StringTokenizer st;
    private int n,r;
    private int arr[];
    private int prevArr[];
    private boolean visit[];
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        br.close();
        
        arr = new int[n];
        prevArr = new int[n];
        visit = new boolean[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = i+1;
        }
        dfs( prevArr, 0);
        System.out.print(sb);
    }
    private void dfs(int[] prevArr, int depth ) throws IOException{
        if(depth == r)
        {
            for(int i=0; i<r; i++)
            {
                sb.append(arr[prevArr[i]] + " ");
            }
            sb.append("\n");
        }
        else
        {
            for(int i=0; i<n; i++)
            {
                if(!visit[i])
                {
                    visit[i] = true;
                    prevArr[depth] = i;
                    dfs(prevArr, depth+1);  
                    visit[i] = false;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }    
}
