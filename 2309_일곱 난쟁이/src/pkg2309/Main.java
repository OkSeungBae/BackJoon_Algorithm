
package pkg2309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int[] heigth;
    private int total=0;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        heigth = new int[9];
        
        for(int i=0; i<9; i++)
        {
            heigth[i] = Integer.parseInt(br.readLine());
            total += heigth[i];
        }
        Arrays.sort(heigth);
        int temp=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                temp = total - heigth[i] - heigth[j];
                if(temp == 100)
                {
                    for(int k=0; k<9; k++)
                    {
                        if(k==i || k==j)
                            continue;
                        else
                        {
                            sb.append(heigth[k]);
                            sb.append("\n");
                        }
                    }
                    System.out.println(sb);
                    return ;
                }
            }
        }
        
    }
    public static void main(String[] args)  throws IOException
    {
        Main main = new Main();
        main.start();
    }
}
