
package pkg10989;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {

    private BufferedReader br;
    private int n;
    private int[] array;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        array = new int[n];
        for(int i=0; i<n; i++)
        {
            array[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(array);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++)
        {
            sb.append(array[i]);
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws IOException{
       new Main().start();
    }
    
}
