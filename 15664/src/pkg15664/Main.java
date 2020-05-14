package pkg15664;

import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private StringBuilder sb;
    private int n,r;
    private int arr[];
    private boolean visit[];
    private Set resultSet;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        resultSet = new TreeSet();
        st = new StringTokenizer(br.readLine());
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
        Iterator setIt = resultSet.iterator();
        while(setIt.hasNext())
        {
            sb.append(setIt.next()+"\n");
        }
        System.out.print(sb);
    }
    private void dfs(int depth, int index)
    {
        if(depth==r)
        {
            String line = "";
            for(int i=0; i<n; i++)
            {
                if(visit[i])
                    line += arr[i]+" ";
            }
            resultSet.add(line);
        }
        else
        {
            for(int i=index; i<n; i++)
            {
                if(visit[i])
                    continue;
                visit[i] = true;
                dfs(depth+1, i);
                visit[i] = false;
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        new Main().start();
    }
    
}
