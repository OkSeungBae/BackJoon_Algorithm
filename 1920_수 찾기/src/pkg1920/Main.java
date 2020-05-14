
package pkg1920;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    private BufferedReader br;
    private StringTokenizer st;
    private int n,m;
    private int[] first, second;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        first = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            first[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(first);
        m = Integer.parseInt(br.readLine());
        second = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++)
        {
            second[i] = Integer.parseInt(st.nextToken());
        }
        check();
    }
    private void check()
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++)
        {
            if(Arrays.binarySearch(first, second[i]) < 0)       //0보다 작으면 찾지 못했다는 뜻
            {
                sb.append(0);
            }
            else
                sb.append(1);
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws IOException{
       new Main().start();
    }
    
}
