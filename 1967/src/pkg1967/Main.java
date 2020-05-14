package pkg1967;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
    
    private BufferedReader br;
    private StringTokenizer st;
    private int node;
    
    public void start() throws IOException
    {
        
        br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());
        for(int i=0; i<node; i++)
        {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            int dis = Integer.parseInt(st.nextToken());
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
