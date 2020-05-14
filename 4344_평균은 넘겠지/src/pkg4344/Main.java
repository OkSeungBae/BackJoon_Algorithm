package pkg4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private BufferedWriter bw;
    private StringTokenizer st;
    private int c;
    private int[] arr;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        c = Integer.parseInt(br.readLine());
        for(int i=0; i<c; i++)
        {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            arr = new int[n];
            int sum = 0;
            for(int j=0; j<n; j++)
            {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            System.out.printf("%.3f%%\n",  CheckAvg(arr, sum));
            //bw.write(Math.round(CheckAvg(arr, sum) * 1000.0) / 1000.0 +"%\n");
        }
        br.close();
        bw.flush();
    }
    private float CheckAvg(int[] arr, int sum)
    {
        float avg = sum / (float)arr.length;
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > avg)
                count++;
        }
        return count / (float)arr.length * 100.0f ;
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }    
}
