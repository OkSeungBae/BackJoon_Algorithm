package pkg5427;

import java.io.*;
import java.util.*;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int testCase;
    private int width, height;
    private int[][] grid;
    private int[][] dist;
    private int[] dx = {1, -1, 0 ,0};
    private int[] dy = {0, 0, 1, -1};
    private Queue<Integer> fireXq = new LinkedList<Integer>();
    private Queue<Integer> fireYq = new LinkedList<Integer>();
    private Queue<Integer> sangXq = new LinkedList<Integer>();
    private Queue<Integer> sangYq = new LinkedList<Integer>();
    private int result;
    private StringBuilder sb;
    private int startX, startY;
    private boolean flag;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());
        sb = new StringBuilder();
        
        for(int i=0; i < testCase; i++)
        {
            st = new StringTokenizer(br.readLine());
            width = Integer.parseInt(st.nextToken());
            height = Integer.parseInt(st.nextToken());
            
            grid = new int[height][width];
            dist = new int[height][width];
            for(int j=0; j < height; j++)
            {
                String line = br.readLine();
                for(int k=0; k < width; k++)
                {
                    char c = line.charAt(k);
                    
                    switch(c)
                    {
                        case '*' :
                            //불
                            grid[j][k] = -1;
                            fireXq.add(k);
                            fireYq.add(j);
                            break;
                        case '.' :
                            //빈 공간
                            grid[j][k] = 0;
                            break;
                        case '@' :
                            //상근이
                            grid[j][k] = 0;
                            sangXq.add(k);
                            sangYq.add(j);
                            break;
                        case '#' :
                            //벽
                            grid[j][k] = 1;
                            break;
                    }
                }
            }
            flag = false;
            result = Integer.MAX_VALUE;
            bfs();
            
            /*System.out.println("여기서 부터 grid 체크");
            for(int j=0; j< height; j++)
            {
                for(int k=0; k<width; k++)
                {
                    System.out.print(grid[j][k] + " ");
                }
                System.out.println();
            }
            
            System.out.println("여기서 부터 dist 체크");
            for(int j=0; j< height; j++)
            {
                for(int k=0; k<width; k++)
                {
                    System.out.print(dist[j][k] + " ");
                }
                System.out.println();
            }*/
            
            if(flag)
                sb.append(result).append("\n");
            else
                sb.append("IMPOSSIBLE").append("\n");
                
        }
        System.out.print(sb);
    }
    
    private void bfs()
    {    
        while(!sangXq.isEmpty())
        {
            int fireLength = fireXq.size();
            int sangLength = sangXq.size();
        
            for(int i=0; i<fireLength; i++)
            {
                int pollX = fireXq.poll();
                int pollY = fireYq.poll();

                for(int j=0; j<4; j++)
                {
                    int nextX = pollX + dx[j];
                    int nextY = pollY + dy[j];
                    if(nextX >= 0 && nextX < width && nextY >= 0 && nextY < height && grid[nextY][nextX] == 0)
                    {
                        // 불 -> 빈 공간
                        grid[nextY][nextX] = -1;
                        fireXq.add(nextX);
                        fireYq.add(nextY);
                    }
                }
            }
            for(int i=0; i<sangLength; i++)
            {
                int pollX = sangXq.poll();
                int pollY = sangYq.poll();

                for(int j=0; j<4; j++)
                {
                    int nextX = pollX + dx[j];
                    int nextY = pollY + dy[j];
                    if(nextX >= 0 && nextX < width && nextY >= 0 && nextY < height && grid[nextY][nextX] == 0)
                    {
                        grid[nextY][nextX] = dist[pollY][pollX] + 1;
                        dist[nextY][nextX] = dist[pollY][pollX] + 1;
                        sangXq.add(nextX);
                        sangYq.add(nextY);
                    }
                    else if(nextX < 0 || nextX >= width || nextY < 0 || nextY >= height)
                    {
                        flag = true;
                        result = dist[pollY][pollX] + 1;
                        return;
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
