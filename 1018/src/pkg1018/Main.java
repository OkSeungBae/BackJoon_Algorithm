
package pkg1018;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    private BufferedReader br;
    private StringTokenizer st;
    private int row, col;
    private char[][] grid;
    private int min = 65;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        grid = new char[row][col];
        for(int i=0; i<row; i++)
        {
            String line = br.readLine();
            for(int j=0; j<col; j++)
            {
                grid[i][j] = line.charAt(j);
            }
        }
        int gapRow = row - 7;
        int gapCol = col - 7;
        for(int i=0; i<gapRow; i++)
        {
            for(int j=0; j<gapCol; j++)
            {
                min = Math.min(min, firstBcheck(j,i));
                min = Math.min(min, firstWcheck(j,i));
            }
        }
        System.out.print(min);
    }
    private int firstWcheck(int x, int y)
    {
        int count=0;
        for(int i=y; i<y+8; i++)
        {
            for(int j=x; j<x+8; j++)
            {
                if((i+j)%2 == 0 && grid[i][j] == 'B')
                {
                    //틀렷음 !!
                    count++;
                }
                else if((i+j)%2 == 1 && grid[i][j] == 'W')
                {
                    //틀렸음!!
                    count++;
                }
            }
        }
        return count;
    }
    private int firstBcheck(int x, int y)
    {
        int count=0;
        for(int i=y; i<y+8; i++)
        {
            for(int j=x; j<x+8; j++)
            {
                if((i+j)%2 == 0 && grid[i][j] == 'W')
                {
                    //틀렷음 !!
                    count++;
                }
                else if((i+j)%2 == 1 && grid[i][j] == 'B')
                {
                    //틀렸음!!
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
