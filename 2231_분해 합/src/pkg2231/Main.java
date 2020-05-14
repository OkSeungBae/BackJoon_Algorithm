package pkg2231;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    private BufferedReader br;
    private String n,sn;
    private int num;
    private int startNum;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = br.readLine();
        num = Integer.parseInt(n);
        startNum = num - 9*n.length();
        if(startNum <0)
        {
            startNum = 0;
        }
        check();
    }
    private void check()
    {
        int total=0;
        for(int i=startNum; i<num; i++)
        {
             sn = String.valueOf(i);
            if(i<0)
            {
                continue;
            }
            total = i;
            for(int j=0; j<sn.length(); j++)
            {
                total+=sn.charAt(j)-'0';
                /*int temp = sn.charAt(j)-'0';
                System.out.println("sn.char의 값 :: "+ sn.charAt(j));
                System.out.println("temp의 값 :: "+ temp + "j의 값 :: "+ j + "sn.legnth의 값 :: "+ sn.length());
                System.out.println("total 의 값 :: "+ total);*/
            }
            if(total == num && i > 0)
            {
                System.out.println(i);
                return ;
            }
        }
        System.out.println(0);
    }
    public static void main(String[] args) throws IOException
    {
        new Main().start();
    }
}
