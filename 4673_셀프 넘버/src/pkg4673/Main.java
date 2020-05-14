
package pkg4673;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    private BufferedWriter bw;
    private String[] num;
    private String[] nonSelfNum;
    public void start() throws IOException
    {
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        nonSelfNum = new String[10001];
        num = new String[10001];
        for(int i=1; i<10001; i++)
        {
            num[i] = "" + i;
        }
       
        check();

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<10001; i++)
        {
            if(num[i] == "0")
            {
                continue;
            }
            sb.append(num[i] + "\n");
        }
        System.out.print(sb);
    }
    private void check()
    {
        int nonNum=0;
        for(int n=1; n<10001; n++)
        {
            int length = num[n].length();
            nonNum = Integer.parseInt(num[n]);
            for(int i=0; i<length; i++)
            {
                nonNum += num[n].charAt(i) - '0';
            }
            nonSelfNum[n] = String.valueOf(nonNum);
        }
        for(int i=1; i<10001; i++)
        {
            int length = nonSelfNum[i].length();         
            for(int j=i; j<=i+length*9; j++)
            {
                if(j>10000)
                    break;
                if(Integer.parseInt(num[j]) == Integer.parseInt(nonSelfNum[i]))
                {
                    num[j] = "" + 0;
                }
            }   
            
        }
    }
    public static void main(String[] args) throws IOException {
     new Main().start();   
    }
}
