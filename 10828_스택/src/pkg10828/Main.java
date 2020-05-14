
package pkg10828;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int n;
    private Stack<Integer> stack;
    private StringBuilder sb;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        stack = new Stack<Integer>();
        sb = new StringBuilder();
        for(int i=0; i<n; i++)
        {
            st = new StringTokenizer(br.readLine());
            switch(st.nextToken())
            {
                case "push" :
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    if(stack.isEmpty())
                        sb.append(-1);
                    else
                        sb.append(stack.pop());
                    sb.append("\n");
                    break;
                case "size" :
                    sb.append(stack.size());
                    sb.append("\n");
                    break;
                case "empty" : 
                    if(stack.isEmpty())
                        sb.append(1);
                    else
                        sb.append(0);
                    sb.append("\n");
                    break;
                case "top" :
                    if(stack.isEmpty())
                        sb.append(-1);
                    else
                        sb.append(stack.peek());
                    sb.append("\n");
                    break;
                default : break;
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
