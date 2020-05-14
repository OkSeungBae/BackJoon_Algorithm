package pkg15654;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private BufferedWriter bw;
    private StringTokenizer st;
    private int n,r;
    private int arr[];
    private StringBuilder sb;
    private int[] prevArr;
    private boolean[] visit;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        
        visit = new boolean[n];
        arr = new int[n];
        
        r = Integer.parseInt(st.nextToken());
        prevArr = new int[r];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        Arrays.sort(arr);
        dfs(0);
        bw.write(sb.toString());
        bw.flush();
        //System.out.print(sb);
        
    }
    private void dfs(int depth)
    {
        if(depth==r)
        {
            for(int i=0; i<r; i++)
            {
                sb.append(prevArr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        else
        {
            for(int i=0; i<n; i++)
            {
                if(visit[i])
                    continue;
                
                visit[i] = true;
                prevArr[depth] = arr[i];
                dfs(depth+1);
                visit[i] = false;
                
            }
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
