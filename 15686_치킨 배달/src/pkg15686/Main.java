
package pkg15686;

import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int n, m;
    private int[][] grid;
    private boolean[][] chicken;
    private ArrayList<Integer> chickenX, chickenY;
    private int minDistance=10000000;
    public void start() throws IOException
    {
        chickenX = new ArrayList<Integer>();
        chickenY = new ArrayList<Integer>();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        grid = new int[n][n];
        chicken = new boolean[n][n];
        for(int i=0; i<n; i++)
        {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++)
            {
                grid[i][j] = Integer.parseInt(st.nextToken());
                if(grid[i][j] == 2)
                {
                    chickenX.add(j);
                    chickenY.add(i);
                }
            }
        }
        chickenHouse(0,0);
        System.out.println(minDistance);
    }
    private void chickenHouse(int count, int num)
    {
        
        if(count == m)
        {
            int dis = 0;
            //치킨거리 체크
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<n; j++)
                {
                    if(grid[i][j] == 1)
                    {
                        dis += chickenDistance(j,i);
                    }
                }
            }
            minDistance = Math.min(minDistance, dis);
            return ;
        }
        if(num >= chickenY.size())
            return ;
        for(int i=0; i<2; i++)
        {
            if(i==0)
            {
                chicken[chickenY.get(num)][chickenX.get(num)] = true;
                chickenHouse(count+1, num+1);
            }
            else
            {
                chicken[chickenY.get(num)][chickenX.get(num)] = false;
                chickenHouse(count, num+1);
            }
        }
    }
    private int chickenDistance(int x, int y)
    {
        int dis = 1000000;
        for(int i=0; i<chickenX.size(); i++)
        {
            if(chicken[chickenY.get(i)][chickenX.get(i)])
            {
                dis = Math.min(dis,(Math.abs(x-chickenX.get(i)) + Math.abs(y-chickenY.get(i))));
            }
        }
        return dis;
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
