
package pkg2526;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int n, p;
    private Map<Integer, Integer> hm;
    public void start() throws IOException
    {
        hm = new HashMap<Integer, Integer>();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());
        hm.put(n, 0);
        check();
        int count = 0;
        for(int key : hm.keySet())
        {
            if(hm.get(key) >= 2)
            {
                count++;
            }
        }
        System.out.print(count);
        
    }
    private void check()
    {
        int nextNum=n;
        while(true)
        {
            nextNum = (nextNum * n) % p;
            if(!hm.containsKey(nextNum))
            {
                hm.put(nextNum, 0);
            }
            hm.put(nextNum, hm.get(nextNum) + 1);
            if(hm.get(nextNum) == 3)
            {
                break;
            }
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
        
    }
    
}
