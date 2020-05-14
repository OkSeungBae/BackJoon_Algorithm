
package pkg10162;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    private BufferedReader br;
    private int t;
    private int[] button = {300, 60, 10};
    private int[] checkButton;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        checkButton = new int[3];
    }
    private void bfs()
    {
        Queue<Integer> q = new LinkedList<Integer>();
        
    }
    public static void main(String[] args) throws IOException{
       new Main().start();
    }
}
