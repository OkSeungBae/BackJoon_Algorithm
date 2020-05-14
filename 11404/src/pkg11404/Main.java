
package pkg11404;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int cityNum, busNum;
    private int[][] cities;
    private int[][] minDistance;
    private boolean[] visit;
    private int min = 10000000;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        cityNum = Integer.parseInt(br.readLine());
        busNum = Integer.parseInt(br.readLine());
        cities = new int[cityNum][cityNum];
        minDistance = new int[cityNum][cityNum];
        visit = new boolean[cityNum];
        for(int i=0; i<busNum; i++)
        {
            st = new StringTokenizer(br.readLine());
            int startCity = Integer.parseInt(st.nextToken())-1;
            int arriveCity = Integer.parseInt(st.nextToken())-1;
            int distance = Integer.parseInt(st.nextToken());
            if(cities[startCity][arriveCity] == 0)
                cities[startCity][arriveCity] = distance;
            else
            {
                cities[startCity][arriveCity] = Math.min(cities[startCity][arriveCity], distance);
            }
        }
        
        for(int i=0; i<cityNum; i++)
        {
            for(int j=0; j<cityNum; j++)
            {
                if(i==j)
                {
                    minDistance[i][j] = 0;
                    continue;
                }
                minDistance[i][j] = dfs(i,j,0);
                min = 10000000;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<cityNum; i++)
        {
            for(int j=0; j<cityNum; j++)
            {
                sb.append(minDistance[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
    private int dfs(int start, int arrive, int dis)
    {    
        int distance=dis;
        visit[start] = true;
        if(visit[arrive])
        {
            visit[arrive] = false;
            min = Math.min(min, distance);
            return min;
        }
        for(int i=0; i<cityNum; i++)
        {
            if(cities[start][i] != 0 && !visit[i])
            {
                distance = dis;
                distance += cities[start][i];
                dfs(i, arrive, distance);
            }
        }
        visit[start] = false;
        return min;
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
