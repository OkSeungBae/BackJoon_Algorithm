package pkg16964;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int n;
    private int tree[];
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());    //접점 갯수
        tree = new int[n+1];          //접점 갯수(tree)
        
        for(int i=0; i<n-1; i++)
        {
            
        }
    }
    
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
