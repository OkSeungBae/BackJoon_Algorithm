package pkg11729;

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
        
        bw.write((int)Math.pow(2.0, n)-1+"\n");
        hanoi(n,1,2,3);
        bw.flush();
    }
    private void hanoi(int n, int start, int sub, int end) throws IOException
    {
        if(n==1)
        {
            bw.write(start + " " + end + "\n");
        }
        else
        {
            hanoi(n-1, start, end, sub);
            bw.write(start + " "  + end + "\n");
            hanoi(n-1, sub, start, end);
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
