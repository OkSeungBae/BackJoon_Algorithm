
package pkg14888;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int n;
    private int[] array;
    private int[] operation, realOper;
    private boolean[] operationB;
    private int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        array = new int[n];
        operation = new int[n-1];
        operationB = new boolean[n-1];
        realOper = new int[n-1];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            array[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int count=0;
        for(int i=0; i<4; i++)
        {
            int temp = Integer.parseInt(st.nextToken());
            for(int j=0; j<temp; j++)
            {
                operation[count] = i;
                count++;
            }
        }
        Sequence(n-2);
        System.out.println(max);
        System.out.println(min);
    }
    private void Sequence(int num)
    {
        if(num < 0)
        {
            boolean flag = true;
            for(int i=0; i<n-1; i++)
            {
                if(!operationB[i])
                {
                    flag = false;
                }
            }
            if(flag)
            {
                check();
            }
            return ;
        }
        //operation의 순서를 정한다
        for(int i=0; i<n-1; i++)
        {
            if(!operationB[i])
            {
                realOper[num] = operation[i];
                operationB[i] = true;
                Sequence(num-1);
                operationB[i] = false;
            }
        }
    }
    private void check()
    {
        int total = array[0];
        for(int i=0; i<array.length-1; i++)
        {
            switch(realOper[i])
            {
                case 0:
                    total = total + array[i+1];
                    break;
                case 1:
                    total = total  - array[i+1];
                    break;
                case 2:
                    total = total  * array[i+1];
                    break;
                case 3:
                    total = total  / array[i+1];
                    break;
                default : break;
            }
        }
        max = Math.max(max, total);
        min = Math.min(min, total);
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
