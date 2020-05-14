
package pkg15683;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int row, col;
    private int[][] grid;
    private ArrayList<Integer> cctvX, cctvY;
    public void start() throws IOException
    {
        cctvX = new ArrayList<Integer>();
        cctvY = new ArrayList<Integer>();
        br =  new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        grid = new int[row][col];
        for(int i=0; i<row; i++)
        {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<col; j++)
            {
                grid[i][j] = Integer.parseInt(st.nextToken());
                if( 0 < grid[i][j] && grid[i][j] < 6)
                {
                    cctvX.add(j);
                    cctvY.add(i);
                }
            }
        }
    }
    private void check(int num)
    {
        switch(grid[cctvY.get(num)][cctvX.get(num)])
        {
            case 1 :
                for(int i=0; i<4; i++)
                {
                    
                }
                break;
            case 2 :
                
                break;
            case 3 :
                for(int i=0; i<4; i++)
                {
                    
                }
                break;
            case 4 :
                for(int i=0; i<4; i++)
                {
                    
                }
                break;
            case 5 :
                
                break;
            default : break;
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    } 
}
