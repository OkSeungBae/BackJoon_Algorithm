
package pkg10158;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int row, col, nowX, nowY, time;

    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        nowX = Integer.parseInt(st.nextToken());
        nowY = Integer.parseInt(st.nextToken());
        time = Integer.parseInt(br.readLine());
        check();
    }
    private void check()
    {
        int x = nowX + time;
        int y = nowY + time;
        if((x/col) % 2 == 0)
        {
            x = x % col;
        }
        else
        {
            x = col - (x % col);
        }
        if((y/row) % 2 == 0)
        {
            y = y % row;
        }
        else
            y = row - (y % row);
        System.out.println(x + " " + y);
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
