package pkg10818;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    
    private BufferedReader br;
    private BufferedWriter bw;
    private StringTokenizer st;
    private int n;
    private int max = Integer.MIN_VALUE;
    private int min = Integer.MAX_VALUE;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            int temp = Integer.parseInt(st.nextToken());
            max = temp>max ? temp : max;
            min = temp<min ? temp : min;
        }
        
        bw.write(min + " " + max);
        bw.flush();
        
    }
    
    public static void main(String[] args) throws IOException{
        new Main().start();
    }    
}
