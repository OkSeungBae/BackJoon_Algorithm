
package pkg1019;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private BufferedReader br;
    private String n;
    private int[] num;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = br.readLine();
        num = new int[10];
        int size = n.length()-1;
        /*for(int i=0; i<n.length(); i++)
        {
            int temp = n.charAt(i)-'0';
            check(temp, size);
            size--;
        }*/
        StringBuilder sb = new StringBuilder();
        check(1,1);
        check(1,0);
        
        for(int i=0; i<10; i++)
        {
            sb.append(num[i] + " ");
        }
        System.out.println(sb);
    }
    private void check(int temp, int size)
    {
        System.out.println("temp :: "+ temp + "size :;" + size);
        for(int i=1; i<temp; i++)
        {
            num[i] += ((temp*size+10) * Math.pow(10, (size-1)));
        }
        num[temp] += ((temp*size) * Math.pow(10, (size-1)) + 1);
        for(int i=temp+1; i<10; i++)
        {
            num[i] += (num[temp] - 1);
        }
        /*if(size < 4)
        {
            if(size == 1)
            {
                num[0] = 1;
            }
            else if(size == 2)
            {
                num[0] = 11;
            }
            else if(size == 3)
            {
                num[0] = 192;
            }
        }
        else
        {
            String zero = String.valueOf((size-2));
            for(int i=0; i<size-3; i++)
            {
                zero += 8;
            }
            zero += 9;
            zero += String.valueOf(size-1);
            num[0] = Integer.parseInt(zero);
        }
        if(size != 0)
        {
            num[0] += ((size * Math.pow(10, (size-1))) * temp);
        }
        else if(size == 0)
            num[0] = 0;
        */
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
