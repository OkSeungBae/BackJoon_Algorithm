
package pkg9372;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int testCase;
    private int country, airline;
    private int[][] grid;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());
        for(int i=0; i<testCase; i++)
        {
            st = new StringTokenizer(br.readLine());
            country = Integer.parseInt(st.nextToken());
            airline = Integer.parseInt(st.nextToken());
            grid = new int[country][country];
            for(int j=0; j<airline; j++)
            {
                st = new StringTokenizer(br.readLine());
                int first = Integer.parseInt(st.nextToken());
                int second = Integer.parseInt(st.nextToken());
            }
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
