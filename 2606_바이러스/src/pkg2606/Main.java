
package pkg2606;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int n, node;
    private int[][] net;
    private boolean[] visit;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        node = Integer.parseInt(br.readLine());
        net = new int[n][n];
        visit = new boolean[n];
        for(int i=0; i<node; i++)
        {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken()) - 1;
            int second = Integer.parseInt(st.nextToken()) - 1;
            net[first][second] = 1;
            net[second][first] = 1;
        }
        visit[0] = true;
        dfs(0);
        int count =0;
        for(int i=0; i<n; i++)
        {
            if(visit[i])
                count++;
        }
        System.out.println(count-1);
    }
    private void dfs(int num)
    {
        for(int i=0; i<n; i++)
        {
            if(net[num][i] == 1 && !visit[i])
            {
                visit[i] = true;
                dfs(i);
            }
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
    
}
