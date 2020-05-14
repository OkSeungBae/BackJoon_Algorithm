
package pkg10809;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int[] alhpa;
    private String s;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        alhpa = new int[26];
        for(int i=0; i<26; i++)
        {
            alhpa[i] = -1;
        }
        s = br.readLine();
        for(int i=s.length()-1; i >=0; i--)
        {
            alhpa[s.charAt(i)-'a'] = i;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26; i++)
        {
            System.out.print(alhpa[i] + " ");
        }
    }
    public static void main(String[] args) throws IOException
    {
        new Main().start();
    }
    
}
