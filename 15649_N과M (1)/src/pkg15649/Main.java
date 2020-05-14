package pkg15649;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private BufferedWriter bw;
    private StringTokenizer st;
    private int n,m;
    private int arr[];
    private boolean visit[];
    private int loadArr[];
    private List resultList;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        st = new StringTokenizer(br.readLine());
        
        br.close();
        
        n = Integer.parseInt(st.nextToken());
        arr = new int[n];
        visit = new boolean[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i] = i+1;
        }
        m = Integer.parseInt(st.nextToken());
        
        dfs(0);
        
        bw.flush();
    }
    private void dfs(int depth) throws IOException
    {
        if(depth == m)
        {
            for(int i=0; i<n; i++)
            {
                if(visit[i])
                    bw.write(arr[i] + " ");
            }
            bw.write("\n");
        }
        else
        {
            for(int i=0; i<n; i++)
            {
                visit[i] = true;
                dfs(depth+1);
                visit[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }    
}
