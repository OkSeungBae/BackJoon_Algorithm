
package pkg2145;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    private BufferedReader br;
    private int n;
    private StringBuilder sb;
    public void start() throws IOException
    {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            n = Integer.parseInt(br.readLine());
            if(n==0)
                break;
            check(String.valueOf(n));
            sb.append("\n");
        }
        System.out.println(sb);
    }
    private void check(String num)
    {
        String tempS = num;
        int temp=0;
        while(tempS.length() != 1)
        {
            temp  = 0 ;
            for(int i=0; i<tempS.length(); i++)
            {
                temp += Integer.parseInt(String.valueOf(tempS.charAt(i)));
            }
            tempS = String.valueOf(temp);
        }
        sb.append(tempS);
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
