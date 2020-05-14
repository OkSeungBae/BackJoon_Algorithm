package pkg1051;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    private BufferedReader br;  //BufferedReader 선언
    private StringTokenizer st; //StringTokenizer 선언
    private int row, col;   //row / col 선언
    private int[][] grid;   //2차원 배열 선언
    private int area=1;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));  //BufferedReader br 선언
        st = new StringTokenizer(br.readLine());    //br.readLine()이 한 줄 읽어서 st에 박기
        
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        
        grid = new int[row][col];   //메모리 할당
        
        for(int i=0; i<row; i++)
        {
            String line = br.readLine();
            for(int j=0; j<col; j++)
            {
                grid[i][j] = line.charAt(j)-'0';    //char to int
            }
        }
        for(int i=0; i<10; i++) //숫자가 한자리 숫자이기 때문에 0부터 9까지 했음
        {
            check(i);
        }
        System.out.println(area);
    }
    private void check(int n)
    {
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(grid[i][j] == n)
                {
                    checkSquare(j,i,n);
                }
            }
        }
    }
    private void checkSquare(int x, int y, int n)
    {
        for(int i=x+1; i<col; i++)
        {
            if( grid[y][i] == n && (y+i-x) < row && grid[y+i-x][i] == n && grid[y+i-x][x] == n)
            {
                area = Math.max(area, (i-x+1)*(i-x+1));
            }
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }    
}
