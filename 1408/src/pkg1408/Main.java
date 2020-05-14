
package pkg1408;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int now[];
    private int des[];
    private int total[];
    public void start() throws IOException
    {
         br = new BufferedReader(new InputStreamReader(System.in));
         String line = br.readLine();
         now = new int[3];
         des = new int[3];
         total = new int[3];
         int count=0;
         StringBuilder sb = new StringBuilder();
         for(int i=0; i<line.length(); i++)
         {
             if(line.charAt(i) == ':')
             {
                now[count] = Integer.parseInt(sb.toString());
                count++;
                sb.delete(0, sb.length());
                continue;
             }
             sb.append(line.charAt(i));
         }
        now[count] = Integer.parseInt(sb.toString());
        count++;
        sb.delete(0, sb.length());
        
        count=0;
        line = br.readLine();
        for(int i=0; i<line.length(); i++)
        {
            if(line.charAt(i) == ':')
             {
                des[count] = Integer.parseInt(sb.toString());
                count++;
                sb.delete(0, sb.length());
                continue;
             }
             sb.append(line.charAt(i));
        }
        des[count] = Integer.parseInt(sb.toString());
        count++;
        sb.delete(0, sb.length());
        check();
        System.out.println(total[0] + ":" + total[1] + ":" + total[2]);
    }
    private void check()
    {
        if(now[0] >= des[0])
            if(now[1] >= des[1])
                if(now[2] > des[2])
                {
                    //현재시간이 더 크다. ,즉 찾은지 얼마 안됨
                    goUp();
                }
        else
        {
            //go down
        }
    }
    private void goUp()
    {
        //total = 목표시간 + (24:00:00 - 현재시간)
        total[0] = 24 - now[0];
        total[1] = 60 - now[1];
        if(total[1] < 60)
            total[0] -= 1;
        total[2] = 60 - now[2];
        if(total[2] < 60)
            total[1] -= 1;
        total[0] += des[0];
        total[1] += des[1];
        total[2] += des[2];
    }
    public static void main(String[] args) throws IOException{
       new Main().start();
    }
}
