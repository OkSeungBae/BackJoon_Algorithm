package pkg2750;

import java.io.*;
import java.util.Arrays;

public class Main {

    private BufferedReader br;
    private BufferedWriter bw;
    private int n;
    private int arr[];
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        Arrays.sort(arr);
        for(int i=0; i<n; i++)
        {
            bw.write(arr[i]+"\n");
        }
        bw.flush();
        
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
    
}
