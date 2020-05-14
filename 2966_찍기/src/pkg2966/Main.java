package pkg2966;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private BufferedReader br;
    private int n;
    private String answer;
    private String Adrian = "ABC";
    private String Bruno = "BABC";
    private String Goran = "CCAABB";
    private String totalA="",totalB="", totalG="";
    private int aA=0,bA=0,gA=0;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        answer = br.readLine();
        check();
        StringBuilder sb = new StringBuilder();
        if(aA >= bA && aA >= gA)
        {
            if(aA == bA && aA == gA)
            {
                sb.append(aA + "\nAdrian\nBruno\nGoran" );
            }
            else if(aA == bA)
            {
                sb.append(aA + "\nAdrian\nBruno");
            }
            else if(aA == gA)
            {
                sb.append(aA + "\nAdrian\nGoran");
            }
            else
                sb.append(aA + "\nAdrian");
        }
        else if(bA >= aA && bA >= gA)
        {
            if(bA == gA)
            {
                sb.append(bA + "\nBruno\nGoran");
            }
            else
                sb.append(bA + "\nBruno");
        }
        else if(gA >= aA && gA >= bA)
        {
            sb.append(gA + "\n" + "Goran" + "\n");
        }
        System.out.println(sb);
    }
    private void check()
    {      
        for(int i=0; i<n/3; i++)
        {
            totalA += Adrian;
        }
        for(int i=0; i<n%3; i++)
        {
            totalA += Adrian.charAt(i);
        }
        for(int i=0; i<n/4; i++)
        {
            totalB += Bruno;
        }
        for(int i=0; i<n%4;  i++)
        {
            totalB += Bruno.charAt(i);
        }
        for(int i=0; i<n/6; i++)
        {
            totalG += Goran;
        }
        for(int i=0;i<n%6; i++)
        {
            totalG += Goran.charAt(i);
        }
        for(int i=0; i<n; i++)
        {
            if(answer.charAt(i) == totalA.charAt(i))
                aA++;
            if(answer.charAt(i) == totalB.charAt(i))
                bA++;
            if(answer.charAt(i) == totalG.charAt(i))
                gA++;
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
