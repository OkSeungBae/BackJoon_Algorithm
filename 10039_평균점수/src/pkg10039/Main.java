package pkg10039;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    private BufferedReader br;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        for(int i=0; i<5; i++)
        {
            int n = Integer.parseInt(br.readLine());
            if(n<40)
                n = 40;
            sum += n;
        }
        System.out.println(sum/5);
    }

    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
