package pkg2667;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    private BufferedReader br;
    private StringBuilder sb;
    private int n;
    private int[][] grid;
    private int[] vx = {-1, 0, 1, 0};
    private int[] vy = {0, 1, 0, -1};
    private Queue<Integer> xq, yq;
    private int count = 2; 
    private List danJiCount;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        danJiCount = new ArrayList<Integer>();
        n = Integer.parseInt(br.readLine());
        grid = new int[n][n];
        for(int i=0; i<n; i++)
        {
            String line = br.readLine();
            for(int j=0; j<line.length(); j++)
            {
                grid[i][j] = line.charAt(j)-'0';
            }
        }
        solution();
        sb.append(danJiCount.size()+"\n");
        Collections.sort(danJiCount);
        Iterator listIt = danJiCount.iterator();
        while(listIt.hasNext())
        {
            sb.append(listIt.next()+"\n");
        }
        System.out.print(sb);
    }
    
    private void solution()
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(grid[i][j]==1)
                {
                    bfs(j,i);
                }
            }
        }
        
    }
    private void bfs(int x, int y)
    {
        int danji = 1;
        int nextX, nextY;
        int poolX, poolY;
        xq = new LinkedList<Integer>();
        yq = new LinkedList<Integer>();
        
        //첫 x,y를 큐에 넣음
        xq.add(x);
        yq.add(y);
        grid[y][x] = count;
        
        while(!xq.isEmpty())
        {
            poolX = xq.poll();
            poolY = yq.poll();
            
            for(int i=0; i<4; i++)
            {
                nextX = poolX + vx[i];
                nextY = poolY + vy[i];
                if( nextX >= 0 && nextY >= 0 && nextX < n && nextY < n && grid[nextY][nextX]==1)
                {
                    grid[nextY][nextX] = count;
                    danji++;
                    xq.add(nextX);
                    yq.add(nextY);
                }
            }
        }
        danJiCount.add(danji);
    }
    
    public static void main(String[] args) throws IOException{
        new Main().start();
    }    
}
