package pkg2562;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    
    private BufferedReader br;
    private BufferedWriter bw;
    private int n, index;
    private int max = -1;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<9; i++)
        {
            n = Integer.parseInt(br.readLine());
            if(max < n)
            {
                max = n;
                index = i+1;
            }
        }
        bw.write(max + "\n" + index);
        bw.flush();
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
    
}
