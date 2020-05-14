
package pkg13163;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int n;
    private ArrayList<String> nameList;
    
    public void start() throws IOException
    {
        StringBuilder sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++)
        {
           
            sb.append("god");
            st = new StringTokenizer(br.readLine());
            st.nextToken();     //제일 앞글자 뺀다
            int temp = st.countTokens();
            for(int j=0; j<temp; j++)
            {
                sb.append(st.nextToken());
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
