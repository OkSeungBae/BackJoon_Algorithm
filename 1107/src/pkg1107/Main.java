
package pkg1107;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    
    private BufferedReader br;
    private StringTokenizer st;
    private String destinationString;
    private int destination;        //목적지
    private int destroyNum;     //파괴된 버튼 수
    private int[] button = {0,1,2,3,4,5,6,7,8,9};
    private int[] realButton;       //사용가능한 버튼
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        destinationString = br.readLine();
        destination = Integer.parseInt(destinationString);
        destroyNum = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<destroyNum; i++)
        {
            int delNum = Integer.parseInt(st.nextToken());
            for(int j=0; j<9; j++)
            {
                if(delNum == button[j])
                {
                    button[j] = 10;
                }
            }
        }
        Arrays.sort(button);
        realButton = new int[10-destroyNum];        //7개
        System.arraycopy(button, 0, realButton, 0, 10-destroyNum);
    }
    private void check(int num)
    {
        for(int i=0; i<realButton.length; i++)
        {
            
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
