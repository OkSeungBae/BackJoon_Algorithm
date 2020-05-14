
package pkg11718;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    private BufferedReader br;
    private StringBuilder sb;
    public void start() throws IOException
    {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<100; i++)
        {
            System.out.println(br.readLine());
        }
    }
    
    public static void main(String[] args) throws IOException
    {
        new Main().start();
    }
    
}
