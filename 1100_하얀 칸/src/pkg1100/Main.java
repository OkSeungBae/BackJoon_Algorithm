
package pkg1100;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private BufferedReader br;
    private char chess[][];
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        chess = new char[8][8];
        int count=0;
        for(int i=0; i<8; i++)
        {
            String line = br.readLine();
            for(int j=0; j<8; j++)
            {
                chess[i][j] = line.charAt(j);
                if( (i+j) % 2 == 0 && chess[i][j] == 'F')
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
    
}
