
package pkg1085;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int min = 1000;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int maxX = Integer.parseInt(st.nextToken());
        int maxY = Integer.parseInt(st.nextToken());
        min = Math.min(maxX-x, min);
        min = Math.min(x, min);
        min = Math.min(maxY - y, min);
        min = Math.min(y, min);
        System.out.println(min);
    }
    public static void main(String[] args) throws IOException {
        new Main().start();
    } 
}
