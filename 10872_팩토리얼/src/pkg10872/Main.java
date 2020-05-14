package pkg10872;

import java.io.*;

public class Main {

    private BufferedReader br;
    private BufferedWriter bw;
    private int n;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        bw.write(factorial(n)+"");
        bw.flush();
    }
    
    private int factorial(int n)
    {
        if(n==0)
            return 1;
        else
            return n * factorial(n-1);
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }   
}
