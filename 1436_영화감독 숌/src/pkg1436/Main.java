package pkg1436;

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
        
        int count = 0;
        int result =0;
        for(int i=0; i<=Integer.MAX_VALUE; i++)
        {
            if(Check666(i))
                count++;
            if(count==n)
            {
                result = i;
                break;
            }
        }
        bw.write(result +"");
        bw.flush();
    }
    private boolean Check666(int n)
    {
        String num = String.valueOf(n);
        
        return num.contains("666");
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
    
}
