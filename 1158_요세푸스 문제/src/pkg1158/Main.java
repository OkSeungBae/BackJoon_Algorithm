
package pkg1158;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int n, m;
    private ArrayList<Integer> list;
    public void start() throws IOException
    {
        list = new ArrayList<Integer>();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        //삽입
        for(int i=1; i<n+1; i++)
        {
            list.add(i);
        }
        StringBuilder sb = new StringBuilder("<");
        int index = 0;
        while(!list.isEmpty())
        {
            index += m-1;
            if(index >= list.size())
                index %= list.size();
            sb.append(list.remove(index) + ", ");
        }
        System.out.print(sb.toString().substring(0,sb.length()-2) + ">");
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
