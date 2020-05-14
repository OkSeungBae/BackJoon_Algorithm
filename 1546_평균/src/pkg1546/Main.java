package pkg1546;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    private BufferedReader br;
    private BufferedWriter bw;
    private StringTokenizer st;
    private int n;
    private int[] arr;
    private int max = Integer.MIN_VALUE;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        
        double sum=0;
        arr = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
            max = arr[i] > max ? arr[i] : max;
        }
        br.close();
        for(int i=0; i<n; i++)
        {
            sum += (arr[i] / (float)max * 100.0);
        }
        double avg = sum / (float)n;
        
        bw.write(Math.round(avg*1000000)/1000000.0 + "");
        bw.flush();
        
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }    
}
