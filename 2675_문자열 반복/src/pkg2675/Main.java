
package pkg2675;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int testCase, n;
    private String s;
    private StringBuilder sb;
    public void start() throws IOException
    {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());
        for(int i=0; i<testCase; i++)
        {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            s = st.nextToken();
            makeString();
            sb.append("\n");
        }
        System.out.print(sb);
    }
    private void makeString()
    {
        for(int i=0; i<s.length(); i++)
        {
            for(int j=0; j<n; j++)
            {
                sb.append(s.charAt(i));
            }
        }
    }
    public static void main(String[] args) throws IOException{
       new Main().start();
    }
}
