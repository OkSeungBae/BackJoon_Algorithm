package pkg10988;

import java.io.*;
import java.util.*;

public class Main {

    private BufferedReader br;
    private String s;
    private boolean flag;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        flag = true;
        
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) != s.charAt(s.length()-1-i))
                flag = false;
        }
        
        if(flag)
            System.out.print(1);
        else
            System.out.print(0);
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
    
}
