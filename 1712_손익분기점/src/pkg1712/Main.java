package pkg1712;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private BufferedWriter bw;
    private StringTokenizer st;
    private int a,b,c;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st = new StringTokenizer(br.readLine());
        
        br.close();
        
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        
        if(c-b<=0)
            bw.write(-1+"");
        else
        {
            int result = a / (c-b) + 1;
            bw.write(result+"");
        }
        
        bw.flush();
    }
    
    public static void main(String[] args) throws IOException{
        new Main().start();
    }    
}
