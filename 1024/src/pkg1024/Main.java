
package pkg1024;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private BufferedReader br;
    private StringTokenizer st;
    private int n,l;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
    
}
