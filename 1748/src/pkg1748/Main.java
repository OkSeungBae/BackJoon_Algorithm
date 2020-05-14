
package pkg1748;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private BufferedReader br;
    private int n;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int length=0;
        for(int i=1; i<=n; i++)
        {
            length += String.valueOf(i).length();
        }
        System.out.println(length);
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
