package pkg7569;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    
    private BufferedReader br;
    private StringTokenizer st;
    private int row,col,num;
    private int[][][] tomato;
    private Queue<Integer> qx,qy,qz;
    private int[] vx={1,-1,0,0,0,0};
    private int[] vy={0,0,1,-1,0,0};
    private int[] vz={0,0,0,0,1,-1};
    private int max=0;
    public void start() throws IOException
    {
        qx = new LinkedList<Integer>();
        qy = new LinkedList<Integer>();
        qz = new LinkedList<Integer>();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());
        num = Integer.parseInt(st.nextToken());
        tomato = new int[num][row][col];
        
        for(int i=0; i<num; i++)
        {
            for(int j=0; j<row; j++)
            {
                st = new StringTokenizer(br.readLine());
                for(int k=0; k<col; k++)
                {
                    tomato[i][j][k] = Integer.parseInt(st.nextToken());
                    if(tomato[i][j][k] == 1)
                    {
                        qx.add(k);
                        qy.add(j);
                        qz.add(i);
                    }
                }
            }
        }
        bfs();
        //최댓값 찾기
        for(int i=0; i<num; i++)
        {
            for(int j=0; j<row; j++)
            {
                for(int k=0; k<col; k++)
                {
                    if(tomato[i][j][k] == 0)
                    {
                        //하나라도 익지 않은 토마토가 있을 경우
                        System.out.println(-1);
                        return ;
                    }
                    max = Math.max(max, tomato[i][j][k]);
                }
            }
        }
        System.out.println(max-1);
    }
    private void bfs()
    {
        int tempX,tempY,tempZ,nextX,nextY,nextZ;
        while(!qx.isEmpty())
        {
            tempX = qx.poll();
            tempY = qy.poll();
            tempZ = qz.poll();
            for(int i=0; i<6; i++)
            {
                nextX = tempX + vx[i];
                nextY = tempY + vy[i];
                nextZ = tempZ + vz[i];
                if(nextX < col && 0 <= nextX
                        && nextY < row && 0 <= nextY
                        && nextZ < num && 0 <= nextZ
                        && tomato[nextZ][nextY][nextX] == 0)
                {
                    tomato[nextZ][nextY][nextX] = tomato[tempZ][tempY][tempX] + 1;
                    qx.add(nextX);
                    qy.add(nextY);
                    qz.add(nextZ);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException
    {
       new Main().start();
    }
}
