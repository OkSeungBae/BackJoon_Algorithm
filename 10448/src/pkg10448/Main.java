
package pkg10448;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private BufferedReader br;
    private int testCase;
    private int k[];
    private int max=0;
    private int uNum[];
    private boolean visit[];
    private boolean rigth[];
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());
        k = new int[testCase];
        rigth = new boolean[testCase];
        for(int i=0; i<testCase; i++)
        {
            k[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, k[i]);
        }
        int index = 0;
        while(true)
        {
            if( max < (index * (index + 1))/2 ) break;
            index++;
        }
        
        //유레카 num 초기화
        uNum = new int[index+1];
        for(int i=1; i<index+1; i++)
        {
            uNum[i] = (i*(i+1))/2;
        }
        for(int i=0; i<testCase; i++)
        {
            System.out.println("여기 얼만큼 인덱스 쓸꺼임?? "+ check(i));
            answer(check(i), 0, i);       //인덱스를 얼만큼 쓸지 나옴
        }
        System.out.println("여기서 부터 출력 !!");
        for(int i=0; i<testCase; i++)
        {
            System.out.print(rigth[i] + " ");
        }
    }
    private void answer(int n, int count, int find)
    {
        if(n<1 || count>3)
        {
            return ;
        }
        if(count==3)
        {
            int total =0 ;
            for(int i=0; i<visit.length; i++)
            {
                if(visit[i])
                {
                    total += uNum[i];
                }
            }
            if(total == k[find])
            {
                rigth[find] = true;
            }
            return ;
        }
        for(int i=0; i<2; i++)
        {
            if(i==0)
            {
                visit[n] = true;
                answer(n-1, count+1, find);
            }
            else
            {
                visit[n] = false;
                answer(n-1, count, find);
            }
        }
    }
    private int check(int n)
    {
        int index=0;
        while(true)
        {
            if(uNum[index] > k[n]) break;
            index++;
        }
        visit = new boolean[index];
        index--;
        return index;
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
