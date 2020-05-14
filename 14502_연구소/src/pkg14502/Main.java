
package pkg14502;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    private BufferedReader br;
    private StringBuilder sb;
    private StringTokenizer st;
    private int n, m;
    private int grid[][];
    private int[][] checkGrid;
    private int vx[] = {1,-1,0,0};
    private int vy[] = {0,0,1,-1};
    private int maxResult = Integer.MIN_VALUE;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        grid = new int[n][m];
        checkGrid = new int[n][m];
        for(int i=0; i<n; i++)
        {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++)
            {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        InstallWall(0 ,0 ,3);
        System.out.print(maxResult);
        //1. 벽을 설치한다 ( 조합 Combination )
        //2. bfs 또는 dfs 로 최종 결과를 확인한다
        //3. 최종 결과 중에서 가장 best 값을 출력한다.
        /*System.out.println("그리드 출력 :: ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }*/
    }
    private void InstallWall(int x, int y, int num)
    {
        if(num==0)
        {
            int wallCount = 0;
            int virusCount = 0;
            int saftyAreaCount = m*n;
            //벽 설치 완료
            //바이러스 퍼진 후 값 확인
            checkGrid = deepCopy(grid);
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<m; j++)
                {
                    if(checkGrid[i][j] == 1)
                    {
                        //벽의 갯수
                        wallCount++;
                    }
                    if(checkGrid[i][j] == 2)
                    {
                        virusCount += bfs(j, i);
                    }
                }
            }
            /*for(int i=0; i<n; i++)
            {
                for(int j=0; j<m; j++)
                {
                    System.out.print(checkGrid[i][j]);
                }
                System.out.println();
            }*/
            saftyAreaCount = saftyAreaCount - virusCount - wallCount;
            /*System.out.println("벽의 갯수 :: " + wallCount);
            System.out.println("바이러스의 갯수  :: " + virusCount);
            System.out.println("안전구역의 갯수 :: " + saftyAreaCount);*/
            maxResult = Math.max(saftyAreaCount, maxResult);
        }
        else
        {
            for(int i=y; i<n; i++)
            {
                for(int j=0; j<m; j++)
                {
                    if(grid[i][j]==0)
                    {
                        grid[i][j] = 1;
                        InstallWall(j ,i ,num-1);
                        grid[i][j] = 0;
                    }
                }
            }
        }
    }
    private int bfs(int x, int y)
    {        
        int virus=1;
        Queue<Integer> xq = new LinkedList<Integer>();
        Queue<Integer> yq = new LinkedList<Integer>();
        
        checkGrid[y][x] = 3;
        xq.add(x);
        yq.add(y);
        
        while(!xq.isEmpty())
        {
            int pollX = xq.poll();
            int pollY = yq.poll();
            for(int i=0; i<4; i++)
            {
                int nextX = pollX + vx[i];
                int nextY = pollY + vy[i];
                if(nextX >= 0 && nextX < m && nextY >= 0 && nextY < n && (checkGrid[nextY][nextX] == 0 || checkGrid[nextY][nextX] == 2))
                {
                    checkGrid[nextY][nextX] = 3;
                    xq.add(nextX);
                    yq.add(nextY);
                    virus++;
                }
            }
        }
        return virus;
    }
    private int[][] deepCopy(int[][] origin)
    {
        int[][] result = new int[origin.length][origin[0].length];
        for(int i=0; i<origin.length; i++)
        {
            System.arraycopy(origin[i], 0, result[i], 0, origin[0].length);
        }
        return result;
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
