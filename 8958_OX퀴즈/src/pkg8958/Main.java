
package pkg8958;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

    private BufferedReader br;
    private int testCase;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<testCase; i++)
        {
            String line = br.readLine();
            sb.append(check(line) + "\n");
        }
        System.out.print(sb);
    }
    private int check(String line)
    {
        int score=0;
        int totalScore = 0;
        for(int i=0; i<line.length(); i++)
        {
            if(line.charAt(i) == 'O')
            {
                score += 1;
            }
            else
                score = 0;
            totalScore += score;
        }
        return totalScore;
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
    
}
