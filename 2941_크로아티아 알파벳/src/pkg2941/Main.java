
package pkg2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private BufferedReader br;
    private String s;
    private String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    public void start() throws IOException
    {
        int count=0;
        br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        for(int i=0; i<s.length(); i++)
        {
            for(int j=0; j<croatia.length; j++)
            {
                if(s.charAt(i) == croatia[j].charAt(0))
                {
                    if(check(i,j))
                    {
                        i = i+croatia[j].length()-1;
                        break;
                    }
                    //false면은 맞지 않음
                    //true면은 맞음
                }
            }
            count++;
        }
        System.out.println(count);
    }
    private boolean check(int sn, int cn)
    {
        for(int i=0; i<croatia[cn].length(); i++)
        {
            if(s.length()<=sn+i)
            {
                return false;
            }
            if(s.charAt(sn+i) != croatia[cn].charAt(i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
