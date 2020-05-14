
package pkg11758;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int[] x,y;
    private double tilt1, tilt2;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        x = new int[3];
        y = new int[3];
        for(int i=0; i<3; i++)
        {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        tilt1 = ( y[1] - y[0] ) / (double)(x[1] - x[0]);
        tilt2 = ( y[2] - y[1] ) / (double)(x[2] - x[1]);
        if(tilt1 > 0)
        {
            if(tilt2 > 0)
            {
                if(tilt1 > tilt2)
                {
                    //반시계
                    System.out.println(1);
                }
                else if(tilt1 < tilt2)
                {
                    //시계
                    System.out.println(-1);
                }
                else
                {
                    //1자
                    System.out.println(0);
                }
            }
            else if(tilt2 == 0)
            {
                //x좌표로
                if(x[1] < x[2])
                {
                    //시계
                    System.out.println(-1);
                }
                else if(x[1] > x[2])
                {
                    //반시계
                    System.out.println(1);
                }
                else
                {
                    System.out.println(0);
                }
            }
            else
            {
                if(y[1] < y[2])
                {
                    //반시계
                    System.out.println(1);
                }
                else if(y[1] > y[2])
                {
                    //시계
                    System.out.println(-1);
                }
            }
        }
        else if(tilt1 <0)
        {
            if(tilt2 > 0)
            {
                if(y[1] < y[2])
                {
                    //반시계
                    System.out.println(1);
                }
                else if(y[1] > y[2])
                {
                    //시계
                    System.out.println(-1);
                }
                else
                    System.out.println(0);
            }
            else if(tilt2 == 0)
            {
                if(x[1] < x[2])
                {
                    //반시계
                    System.out.println(-1);
                }
                else if(x[1] > x[2])
                {
                    //시계
                    System.out.println(1);
                }
                else
                {
                    System.out.println(0);
                }
            }
            else
            {
                if(tilt2 > tilt1)
                {
                    //반시계
                    System.out.println(1);
                }
                else if(tilt2 < tilt1)
                {
                    System.out.println(-1);
                }
                else
                    System.out.println(0);
            }
        }
        else
        {
            if(tilt2 == 0)
            {
                System.out.println(0);
            }
            else if(tilt2 > 0)
            {
                //반시계
                System.out.println(1);
            }
            else
            {
                System.out.println(-1);
            }
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
