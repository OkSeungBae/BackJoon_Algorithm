
package pkg1120;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private String a,b;
    private int gap;
    private int min=51;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        a = st.nextToken();
        b = st.nextToken();
        gap = b.length() - a.length();
        for(int i=0; i<=gap; i++)
        {
            int count=0;
            for(int j=0; j<a.length(); j++)
            {
                if( a.charAt(j) != b.charAt(i+j))
                    count++;
            }
            min = Math.min(min, count);
        }
        System.out.println(min);
    }
    public static void main(String[] args) throws IOException{
       new Main().start();
    }
}
