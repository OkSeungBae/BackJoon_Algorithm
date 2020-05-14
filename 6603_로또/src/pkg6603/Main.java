
package pkg6603;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class Main {

    private BufferedReader br;
    private BufferedWriter bw;
    private StringTokenizer st;
    private int n=1;
    private int[] num;
    private boolean[] visit;
    private StringBuilder sb;
    public void start() throws IOException
    {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(n>0)
        {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            if(n==0)
                break;
            else
            {
                num = new int[n];
                visit = new boolean[n];
                for(int i=0; i<n; i++)
                {
                    visit[i] = false;
                }
                for(int i=0; i<n; i++)
                {
                    num[i] = Integer.parseInt(st.nextToken());
                }
                //숫자가 다 들어갔다.
                check(0);         
                num = null;
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
    private void check(int index) throws IOException
    {
        if(index > n-1)
        {
            int count=0;
            for(int i=0; i<n; i++)
            {
                if(visit[i])
                    count++;
            }
            if(count==6)
            {
                print();
            }
            return ;
        }
        for(int i=0; i<2; i++)
        {
            if(i==0)
                visit[index] = true;
            else
                visit[index] = false;
            check(index+1);
        }
    }
    private void print() throws IOException
    {
        for(int i=0; i<n; i++)
        {
            if(visit[i])
            {
                sb.append(num[i] + " ");
            }
        }
        sb.append("\n");
    }
    public static void main(String[] args) throws IOException{
       new Main().start();
    }
}
