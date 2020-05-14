
package pkg5014;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int max, now, des, u,d;
    private int[] building;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        
        max = Integer.parseInt(st.nextToken());
        building = new int[max+1];
        now = Integer.parseInt(st.nextToken());
        des = Integer.parseInt(st.nextToken());
        u = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        building[now] = 1;
        
        bfs();

       if(building[des] == 0)
            System.out.println("use the stairs");
        else
            System.out.println(building[des] - 1);
    }
    private void bfs()
    {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(now);
        int temp;
        while(!q.isEmpty())
        {
            if(building[des] != 0 )
                break;
            temp = q.poll();
            if((temp+u) <= max && building[temp+u] == 0)
            {
                q.add(temp+u);
                building[temp+u] = building[temp] + 1;
            }   
            if(0 < (temp-d) && building[temp-d] == 0)
            {
                q.add(temp-d);
                building[temp-d] = building[temp] + 1;
            }
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
