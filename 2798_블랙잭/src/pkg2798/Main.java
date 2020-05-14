package pkg2798;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private BufferedWriter bw;
    private StringTokenizer st;
    private int n,m;
    private int[] arr;
    private int result = -1;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());       //카드의 갯수
        m = Integer.parseInt(st.nextToken());       //최댓값
        arr = new int[n];
        
        st = new StringTokenizer(br.readLine());
        br.close();
        for(int i=0; i<n; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        FindMax();
        
        bw.write(result+"");
        bw.flush();

    }
    
    private void FindMax() throws IOException
    {
        for(int i=0; i<arr.length-2; i++)
        {
            int sum = 0;
            sum += arr[i];
            for(int j=i+1; j<arr.length-1; j++)
            {
                sum = arr[i];
                sum += arr[j];
                for(int k=j+1; k<arr.length; k++)
                {
                    sum = arr[i]+arr[j];
                    sum += arr[k]; 
                    if(m-sum>=0)
                        if(m-sum < m-result)
                            result = sum;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
    
}
