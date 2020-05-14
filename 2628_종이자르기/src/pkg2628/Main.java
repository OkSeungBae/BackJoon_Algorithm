
package pkg2628;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int row, col, n;
    private ArrayList<Integer> ga,se;
    private int[][] paper;
    private int[] vx = {1,-1,0,0};
    private int[] vy = {0,0,1,-1};
    private Map<Integer, Integer> hm;
    public void start() throws IOException
    {
        hm = new HashMap<Integer, Integer>();
        ga = new ArrayList<Integer>();
        se = new ArrayList<Integer>();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(br.readLine());
        int temp, tempNum;
        for(int i=0; i<n; i++)
        {
            st = new StringTokenizer(br.readLine());
            temp = Integer.parseInt(st.nextToken());
            tempNum = Integer.parseInt(st.nextToken());
            if(temp == 0)
            {
                row++;
                ga.add(tempNum);
            }
            else
            {
                col++;
                se.add(tempNum);
            }
        }
        paper = new int[row][col];
        cut();
        
        int count = 2;
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(paper[i][j] == 0)
                {
                    dfs(j,i,count);
                    count++;
                }
            }
        }
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
               if(!hm.containsKey(paper[i][j]))
               {
                   hm.put(paper[i][j], 0);
               }
               hm.put(paper[i][j], hm.get(paper[i][j]) + 1);
            }
        }
        int max = 0;
        for(int key : hm.keySet())
        {
            if(key != 1)
            {
                max = Math.max(max, hm.get(key));
            }
        }
        System.out.println(max);
    }
    private void dfs(int x, int y, int num)
    {
        int tempX = x;
        int tempY = y;
        int nextX, nextY;
        
        for(int i=0; i<4; i++)
        {
            nextX = tempX + vx[i];
            nextY = tempY + vy[i];
            if(nextX < col && 0 <= nextX
                    && nextY < row && 0 <= nextY
                    && paper[nextY][nextX] == 0)
            {
                paper[nextY][nextX] = num;
                dfs(nextX, nextY,num);
            }
        }
    }
    private void cut()
    {
        Collections.sort(ga);
        Collections.sort(se);
        int gaCount=0, seCount=0;
        for(int i=0; i<ga.size(); i++)
        {
            for(int j=0; j<row; j++)
            {
                for(int k=0; k<col; k++)
                {
                    if( j == ga.get(i) + gaCount)
                    {
                        paper[j][k] = 1;
                    }
                }
            }
            gaCount++;
        }
        for(int i=0; i<se.size(); i++)
        {
            for(int j=0; j<row; j++)
            {
                for(int k=0; k<col; k++)
                {
                    if( k == se.get(i) + seCount)
                    {
                        paper[j][k] = 1;
                    }
                }
            }
            seCount++;
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
