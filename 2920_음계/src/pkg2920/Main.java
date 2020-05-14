
package pkg2920;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int[] array;
    private int ascCount=0, desCount=0;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        array = new int[8];
        for(int i=0; i<8 ;i++)
        {
            array[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<8; i++)
        {
            if(i+1<8)
            {
                if(array[i] < array[i+1])
                    ascCount++;
                else
                    desCount++;
            }
        }
        if(ascCount == 7)
            System.out.println("ascending");
        else if(desCount == 7)
            System.out.println("descending");
        else
            System.out.println("mixed");
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
    
}
