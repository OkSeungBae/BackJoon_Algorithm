
package pkg11721;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private BufferedReader br;
    private String line;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        line = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<line.length(); i++)
        {
            sb.append(line.charAt(i));
            if((i+1) % 10 == 0)
            {
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
