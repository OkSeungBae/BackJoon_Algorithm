
package pkg1302;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;

public class Main {
    private Map<String, Integer> hm;
    private BufferedReader br;
    private int n;
    public void start() throws IOException
    {
        hm = new HashMap<String, Integer>();
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++)
        {
            String line = br.readLine();
            if(!hm.containsKey(line))
            {
                hm.put(line, 0);
            }
            hm.put(line, hm.get(line) + 1);
        }
        TreeMap<String, Integer> tm = new TreeMap<String, Integer>(hm);    //TreeMap에 넣는순간 오름차순 정렬
        int max = 0;
        String maxString = " ";
        for(String key :tm.keySet())
        {
            if(max < tm.get(key))
            {
                max = tm.get(key);
                maxString = key;
            }
        }
        System.out.println(maxString);
    }
    public static void main(String[] args) throws IOException
    {
        new Main().start();
    }
    
}
