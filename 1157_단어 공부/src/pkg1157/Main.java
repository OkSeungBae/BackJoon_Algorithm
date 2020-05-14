
package pkg1157;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {

    private BufferedReader br;
    private String s;
    private char[] bigS;
    private int[] alpa;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        bigS = new char[s.length()];
        alpa = new int[26];
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) <= 'z' && 'a' <= s.charAt(i))
                bigS[i] = (char)(s.charAt(i) - 32);
            else
                bigS[i] = s.charAt(i);
            alpa[(bigS[i] - 'A')]++;
        }
        int max=0;
        char maxChar='A';

        for(int i=0; i<26; i++)
        {
            if(max < alpa[i])
            {
                maxChar = (char)(i+'A');
                max = alpa[i];
            }
        }
        Arrays.sort(alpa);
        if(alpa[alpa.length-1] == alpa[alpa.length-2])
        {
            System.out.println("?");
        }
        else
            System.out.println(maxChar);
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
