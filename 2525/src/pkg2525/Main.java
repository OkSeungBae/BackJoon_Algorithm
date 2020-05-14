
package pkg2525;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int h,m, time;
    private int goH, goM, totalH, totalM;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        h = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        time = Integer.parseInt(br.readLine());
        check();
        System.out.println(totalH + " " + totalM);
    }
    private void check()
    {
        goH = time / 60;
        goM = time % 60;
        totalM = goM + m;
        if(totalM > 60)
        {
            totalM = totalM - 60;
            goH++;
        }
        totalH = goH + h;
        if(totalH >= 24)
        {
            totalH = totalH - 24;
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
    
}
