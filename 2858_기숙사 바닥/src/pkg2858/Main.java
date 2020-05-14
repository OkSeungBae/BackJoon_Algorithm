
package pkg2858;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int edge, center, area;
    private ArrayList<Integer> n;
    private int row,col;
    public void start() throws IOException
    {
        n = new ArrayList<Integer>();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        edge = Integer.parseInt(st.nextToken());
        center = Integer.parseInt(st.nextToken());
        area = edge + center;
        //약수 구하기
        for(int i=1; i<=area; i++)
        {
            if(area % i == 0)
                n.add(i);
        }
        for(int i=1; i<=n.size()/2; i++)
        {
            check(n.get(i), n.get(n.size()-1-i));
        }
        System.out.println(col + " "+  row);
    }
    private void check(int first, int second)
    {
        if((first-2) * (second-2) == center)
        {
            col = Math.max(first, second);
            row = Math.min(first, second);
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
