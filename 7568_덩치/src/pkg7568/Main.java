
package pkg7568;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int n;
    private int[] weigth, heigth,totalScore;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        weigth = new int[n];
        heigth = new int[n];
        totalScore = new int[n];
        for(int i=0; i<n; i++)
        {
            st = new StringTokenizer(br.readLine());
            weigth[i] = Integer.parseInt(st.nextToken());
            heigth[i] = Integer.parseInt(st.nextToken());
        }
        check();
        for(int i=0; i<n; i++)
        {
            System.out.print(totalScore[i] + " ");
        }
        System.out.println();
    }
    private void check()
    {
        
        for(int i=0; i<n; i++)
        {
            int count=1;
            for(int j=0; j<n; j++)
            {
                if(weigth[i] < weigth[j] && heigth[i] < heigth[j])
                {
                    count++;
                }
            }
            totalScore[i] = count;
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
    
}
