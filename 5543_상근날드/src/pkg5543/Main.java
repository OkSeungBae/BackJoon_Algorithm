package pkg5543;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private BufferedReader br;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        int minBuger=2001;
        int minDrink=2001;
        
        for(int i=0; i<3; i++)
        {
            int n= Integer.parseInt(br.readLine());
            minBuger = minBuger<n ? minBuger : n;
        }
        for(int i=0; i<2; i++)
        {
            int n = Integer.parseInt(br.readLine());
            minDrink = minDrink<n ? minDrink : n;
        }
        int total = minBuger + minDrink - 50;
        System.out.println(total);
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
