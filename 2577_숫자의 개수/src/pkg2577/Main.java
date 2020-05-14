
package pkg2577;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
public class Main {

    private BufferedReader br;
    private int a,b,c,sum;
    private String stringSum;
    private Map<Character, Integer> hm;
    public void start() throws IOException
    {
        hm = new HashMap<Character, Integer>();
        br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        sum = a*b*c;
        stringSum = String.valueOf(sum);
        for(int i=0; i<10; i++)
        {
            hm.put(Character.forDigit(i, 10), 0);
        }
        for(int i=0; i<stringSum.length(); i++)
        {
            hm.put(stringSum.charAt(i), hm.get(stringSum.charAt(i))+1);
        }
        StringBuilder sb = new StringBuilder();
        for(char key : hm.keySet())
        {
            sb.append(hm.get(key) + "\n");
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
