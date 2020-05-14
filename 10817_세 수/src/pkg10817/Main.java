package pkg10817;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    
    private BufferedReader br;
    private StringTokenizer st;
    private int n[];
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = new int[3];
        n[0] = Integer.parseInt(st.nextToken());
        n[1] = Integer.parseInt(st.nextToken());
        n[2] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(n);
        System.out.print(n[1]);
    }
    
    public static void main(String[] args) throws IOException{
       new Main().start();
    }
}
