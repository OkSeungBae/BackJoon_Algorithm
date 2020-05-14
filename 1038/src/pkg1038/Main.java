
package pkg1038;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private BufferedReader br;
    private int n;
    private String num;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int numLength;
        int number=0;
        int count=0;
        while(count<n)
        {
            num = String.valueOf(number);
            numLength = num.length();
            if(check(numLength))
                count++;
            number++;
        }
        System.out.println(number);
    }
    private boolean check(int length)
    {
        boolean flag = true;
        for(int i=0; i<length-1; i++)
        {
            if(num.charAt(i) <= num.charAt(i+1))
            {
                //한번이라도 큰 경우가 있다면
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
