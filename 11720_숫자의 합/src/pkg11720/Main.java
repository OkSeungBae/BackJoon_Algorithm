package pkg11720;

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
        int sum=0;
        String line=br.readLine();
        for(int i=0; i<n; i++)
        {
            sum += Integer.parseInt(String.valueOf(line.charAt(i)));
        }
        br.close();
        bw.write(sum+"");
        bw.flush();
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }   
}
