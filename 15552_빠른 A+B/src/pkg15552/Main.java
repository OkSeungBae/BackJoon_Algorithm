
package pkg15552;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    private BufferedReader br;
    private StringTokenizer st;
    private int testCase;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        int a,b;
        testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<testCase; i++)
        {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sb.append((a+b) + "\n");
        }
        System.out.println(sb);
    }
    
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
    
}
