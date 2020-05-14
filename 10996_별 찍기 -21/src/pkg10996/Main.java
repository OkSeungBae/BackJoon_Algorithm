package pkg10996;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class Main {

    private BufferedReader br;
    private BufferedWriter bw;
    private int n;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(j%2==0)
                    bw.write("*");
                else
                    bw.write(" ");
            }
            bw.write("\n");
            for(int j=0; j<n; j++)
            {
                if(j%2==0)
                    bw.write(" ");
                else
                    bw.write("*");
            }
            bw.write("\n");
        }        
        bw.flush();
    }
    
    public static void main(String[] args) throws IOException{
        new Main().start();
    }    
}
