package pkg2447;

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
        
        printStar(n);
        
        bw.flush();
    }
    private void printStar(int n) throws IOException
    {
        if(n==1)
            bw.write("*");
        else
        {
            printStar(n/3);
            printStar(n/3);
            printStar(n/3);
            bw.write("\n");
            printStar(n/3);
            bw.write(" ");
            printStar(n/3);
            bw.write("\n");
            printStar(n/3);
            printStar(n/3);
            printStar(n/3);
        }
    }

    public static void main(String[] args) throws IOException{
        new Main().start();
    }    
}
