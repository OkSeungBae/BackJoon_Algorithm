
package pkg15780;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int n,k;
    private int ableNum=0;  // 사용 가능한 인원수
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int multiTap=0;
        for(int i=0; i<k; i++)
        {
            multiTap = Integer.parseInt(st.nextToken());
            if(multiTap %2 ==0)
            {
                //멀티탭의 구의 수가 짝수이면
                ableNum += (multiTap / 2);
            }
            else
            {
                //멀티탭의 수의 수가 홀수이면
                ableNum += (multiTap/2) + 1;
            }
        }
        if( n <= ableNum)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static void main(String[] args) throws IOException{
       new Main().start();
    }
}
