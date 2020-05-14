package pkg15663;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private StringBuilder sb;
    private int n,r;
    private int[] arr, prevArr;
    private boolean[] visit;
    private Set resultSet;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        resultSet = new TreeSet();
        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        arr = new int[n];
        prevArr = new int[r];
        visit = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(0);
        Iterator setIt = resultSet.iterator();
        while(setIt.hasNext())
        {
            sb.append(setIt.next()+"\n");
        }
        System.out.print(sb);
    }
    private void dfs(int depth)
    {
        if(depth == r)
        {
            String resultString="";
            for(int i=0; i<r; i++)
            {
                //sb.append(prevArr[i]).append(" ");
                resultString += prevArr[i]+" ";
            }
            //sb.append("\n");
            resultSet.add(resultString);
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
