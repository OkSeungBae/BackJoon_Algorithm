package pkg2751;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    private BufferedReader br;
    private int n;
    private int[] array;
    private boolean[] arrayNum;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        array = new int[n];
        arrayNum = new boolean[1000001];
        for(int i=0; i<n; i++)
        {
            array[i] = Integer.parseInt(br.readLine());
            arrayNum[array[i]] = true;
        }
       // Arrays.sort(array);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<1000001; i++)
        {
            if(arrayNum[i])
            {
                sb.append(i);
                sb.append("\n");
            }   
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
