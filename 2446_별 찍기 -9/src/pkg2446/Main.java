package pkg2446;

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
            for(int j=0; j<i; j++)
            {
                bw.write(" ");
            }
            for(int j=n*2-1; j>i*2; j--)       //9 7 5 3
            {
                bw.write("*");
            }
            bw.write("\n");
        }
        for(int i=1; i<n; i++)
        {
            for(int j=n-1; j>i; j--)      //
            {
                bw.write(" ");
            }
            for(int j=0; j<i*2+1; j++)        //3 5 7 9
            {
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
