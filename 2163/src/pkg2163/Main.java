
package pkg2163;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private BufferedReader br;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
