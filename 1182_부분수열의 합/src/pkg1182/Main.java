
package pkg1182;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int num, sum;
    private int[] array;
    private boolean[] visit;
    private int count =0;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        num = Integer.parseInt(st.nextToken());
        sum = Integer.parseInt(st.nextToken());
        array = new int[num];
        visit = new boolean[num];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++)
        {
            array[i] = Integer.parseInt(st.nextToken());
        }
        search(num-1);
        System.out.println(count);
    }
    private void search(int n)
    {
        if(n<0)
            check();
        else
        {
            for(int i=0; i<2; i++)
            {
                if(i==0)
                    visit[n] = false;
                else
                    visit[n] = true;
                search(n-1);
            }
        }    
    }
    private void check()
    {
        boolean flag = false;
        int total = 0;
        for(int i=0; i<num; i++)
        {
            if(visit[i])
            {
                //하나라도 true가 있음
                flag = true;
                total += array[i];
            }
        }
        if(total == sum && flag)
        {
            count++;
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
