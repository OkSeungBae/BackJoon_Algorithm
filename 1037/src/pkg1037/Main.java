
package pkg1037;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int n;
    private int max=0 , min=1000000;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            int num = Integer.parseInt(st.nextToken());
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        System.out.println(max*min);
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
