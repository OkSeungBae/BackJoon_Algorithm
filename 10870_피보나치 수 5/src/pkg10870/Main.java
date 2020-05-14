package pkg10870;

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
        
        br.close();
        bw.write(fibonacci(n)+"");
        bw.flush();
    }
    
    private int fibonacci(int n)
    {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
    
    public static void main(String[] args) throws IOException{
        new Main().start();
    }    
}
