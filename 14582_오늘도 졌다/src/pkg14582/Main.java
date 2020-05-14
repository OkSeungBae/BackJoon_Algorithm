package pkg14582;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int[] my,your;
    private int myScore=0, yourScore=0;
    private boolean flag = false;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        my = new int[9];
        your = new int[9];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<9; i++)
        {
            my[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<9; i++)
        {
            your[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<9; i++)
        {
            myScore += my[i];
            if(myScore > yourScore)
            {
                flag = true;
            }
            yourScore += your[i];
        }
        if(flag)
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
    
    public static void main(String[] args) throws IOException
    {
        Main main = new Main();
        main.start();
    }
}
