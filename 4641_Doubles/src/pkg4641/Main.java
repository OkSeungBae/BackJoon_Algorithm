
package pkg4641;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int[] n;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true)
        {
            st = new StringTokenizer(br.readLine());
            n = new int[st.countTokens()];
            for(int i=0; i<n.length; i++)
            {
                n[i] = Integer.parseInt(st.nextToken());
                if(n[0] == -1)
                {
                    System.out.print(sb);
                    return ;
                }
            }
            sb.append(check(n) + "\n");
        }
    }
    private int check(int[] num)
    {
        int count=0;
        for(int i=0; i<num.length-1; i++)
        {
            for(int j=0; j<num.length-1; j++)
            {
                if((num[i]*2) == num[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
