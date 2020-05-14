package pkg15656;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringBuilder sb;
    private StringTokenizer st;
    private int n,r;
    private int[] arr;
    private boolean[] visit;
    private int[] prevArr;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        arr = new int[n];
        visit = new boolean[n];
        prevArr = new int[r];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(0);
        System.out.print(sb);
    }
    private void dfs(int depth)
    {
        if(depth == r)
        {
           for(int i=0; i<r; i++)
           {
               sb.append(prevArr[i]).append(" ");
           }
           sb.append("\n");
        }
        else
        {
            for(int i=0; i<n; i++)
            {
                //if(visit[i])
                    //continue;
                prevArr[depth] = arr[i];
                //visit[i] = true;
                dfs(depth+1);
                //visit[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }    
}
