
package pkg1316;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Main {

    private BufferedReader br;
    private int n;
    private Map<Character, Integer> hm;
    private int count=0;
    public void start() throws IOException
    {
        hm = new HashMap<Character, Integer>();
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++)
        {
            String line = br.readLine();
            hm.clear();
            check(line);
        }
        System.out.println(count);
    }
    private void check(String line)
    {
        for(int i=0; i<line.length(); i++)
        {
            if(!hm.containsKey(line.charAt(i)))
            {
                hm.put(line.charAt(i), 1);
            }
            else
            {
                if(line.charAt(i-1) != line.charAt(i))
                {
                    return ;
                }
            }
        }
        count++;
    }
    public static void main(String[] args) throws IOException
    {
        new Main().start();
    }
}
