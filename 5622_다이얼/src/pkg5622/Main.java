package pkg5622;

import java.io.*;

public class Main {

    private BufferedReader br;
    private BufferedWriter bw;
    private String line;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        line = br.readLine();
        br.close();
        
        int sum=0;
        for(int i=0; i<line.length(); i++)
        {
            sum += CheckSecond(line.charAt(i));
        }
        bw.write(sum+"");
        bw.flush();
    }
    private int CheckSecond(char c)
    {
        switch(c)
        {
            case 'A':
            case 'B':
            case 'C':
                return 3;
            
            case 'D':
            case 'E':
            case 'F':
                return 4;
            
            case 'G':
            case 'H':
            case 'I':
                return 5;
                
            case 'J':
            case 'K':
            case 'L':
                return 6;
            
            case 'M':
            case 'N':
            case 'O':
                return 7;
            
            case 'P':
            case 'Q':
            case 'R':
            case 'S': 
                return 8;
                
            case 'T':
            case 'U':
            case 'V':
                return 9;
                
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                return 10;
        }
        return 0;
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
