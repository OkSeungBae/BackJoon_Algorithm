package pkg11654;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class Main {

    private BufferedReader br;
    private BufferedWriter bw;
    private char c;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        c = br.readLine().charAt(0);
        br.close();
        bw.write((int)c+"");
        bw.flush();
        
    }
    
    public static void main(String[] args) throws IOException{
        new Main().start();
    }    
}
