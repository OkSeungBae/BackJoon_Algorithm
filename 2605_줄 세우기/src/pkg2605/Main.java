
package pkg2605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int n;
    private int[] student;
    public void start() throws IOException
    {
         br = new BufferedReader(new InputStreamReader(System.in));
         n = Integer.parseInt(br.readLine());
         student = new int[n];
         for(int i=0; i<n; i++)
         {
             student[i] = i+1;
         }
         st = new StringTokenizer(br.readLine());
         int temp;
         for(int i=0; i<n; i++)
         {
            temp = Integer.parseInt(st.nextToken());
            for(int j=0; j<temp; j++)
            {
                Change(i-j);
            }
         }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++)
        {
            sb.append(student[i] + " ");
        }
        System.out.print(sb);
    }
    private void Change(int index)
    {
        int temp;
        temp = student[index];
        student[index] = student[index-1];
        student[index-1] = temp;
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
