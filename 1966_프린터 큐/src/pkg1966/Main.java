
package pkg1966;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int testCase;
    private int n,m;
    private int[] sortPrintArray;
    private Queue<Integer> printQ, numQ;
    public void start() throws IOException
    {
        printQ = new LinkedList<Integer>();
        numQ = new LinkedList<Integer>();
        br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<testCase; i++)
        {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            sortPrintArray = new int[n];
            for(int j=0; j<n; j++)
            {
                sortPrintArray[j] = Integer.parseInt(st.nextToken());
                printQ.add(sortPrintArray[j]);
                numQ.add(j);
            }
            Arrays.sort(sortPrintArray);
            sb.append(check());
            sb.append("\n");
            printQ.clear();
            numQ.clear();
        }
        System.out.print(sb);
    }
    private int check()
    {
        int count=0;
        for(int i=sortPrintArray.length-1; i>=0; i--)
        {
            if(sortPrintArray[i] == printQ.peek())
            {
                count++;
                printQ.poll();
                if(numQ.poll()==m)
                {
                    return count;
                }
            }
            else
            {
                printQ.add(printQ.poll());
                numQ.add(numQ.poll());
                i++;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException{
       new Main().start();
    }    
}
