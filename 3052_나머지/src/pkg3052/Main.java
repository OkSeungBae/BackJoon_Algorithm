package pkg3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.util.HashSet;

public class Main {

    private BufferedReader br;
    private BufferedWriter bw;
    private HashSet<Integer> hs;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        hs = new HashSet<>();
        
        for(int i=0; i<10; i++)
        {
            int n = Integer.parseInt(br.readLine());
            hs.add(n%42);
        }
        br.close();
        
        bw.write(hs.size()+"");
        bw.flush();
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }    
}
