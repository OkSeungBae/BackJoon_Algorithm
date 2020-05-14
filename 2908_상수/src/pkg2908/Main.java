package pkg2908;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private BufferedWriter bw;
    private StringTokenizer st;
    
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st = new StringTokenizer(br.readLine());
        br.close();
        
        String first = st.nextToken();
        String second = st.nextToken();
        char[] firstChar = first.toCharArray();
        char[] secondChar = second.toCharArray();
        
        ChangeNum(firstChar);
        ChangeNum(secondChar);
        
        String firstNum = new String(firstChar);
        String secondNum = new String(secondChar);
        
        bw.write(Integer.parseInt(firstNum) > Integer.parseInt(secondNum) ? firstNum : secondNum);
        bw.flush();
    }
    private void ChangeNum(char[] arr)
    {
        char temp;
        temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
    
}
