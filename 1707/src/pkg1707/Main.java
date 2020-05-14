package pkg1707;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int testCase;
    private int node,line;
    private int[][] grid;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());
        for(int i=0; i<testCase; i++)
        {
            st = new StringTokenizer(br.readLine());
            node = Integer.parseInt(st.nextToken());
            grid = new int[node][node];
            line = Integer.parseInt(st.nextToken());
            for(int j=0; j<line; j++)
            {
                st = new StringTokenizer(br.readLine());
                int first, second;
                first = Integer.parseInt(st.nextToken()) - 1;
                second = Integer.parseInt(st.nextToken()) - 1;
                grid[first][second] = 1;
                grid[second][first] = 1;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        
    }
    
}
