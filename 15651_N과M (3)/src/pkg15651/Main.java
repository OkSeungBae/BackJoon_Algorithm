package pkg15651;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringBuilder sb;
    private StringTokenizer st;
    private int n,r;
    private int[] arr;
    private int[] prevArr;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        br.close();
        
        arr = new int[n];
        prevArr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = i+1;
        }
        Combination(prevArr, n, r, 0, 0);
        System.out.print(sb);
    }
    
    private void Combination(int[] prevArr, int n, int r, int index, int target) throws IOException
    {
        if(r==0)
        {
            for(int i=0; i<index; i++)
            {
                sb.append(arr[prevArr[i]] + " ");
            }
            sb.append("\n");
        }
        else if(target == n)
        {
            return ;
        }
        else
        {
            prevArr[index] = target;
            Combination(prevArr, n, r-1, index+1, target);
            Combination(prevArr, n, r, index, target+1);
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }    
}
