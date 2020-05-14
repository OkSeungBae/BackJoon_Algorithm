
package pkg1991;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int n;
    private int[] tree;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        tree = new int[n];
        for(int i=0; i<n; i++)
        {
            tree[i] = -1;
        }
        int temp=0;
        for(int i=0; i<n; i++)
        {
            st = new StringTokenizer(br.readLine());
            String first = st.nextToken();
            String second = st.nextToken();
            String third = st.nextToken();
            if(second.charAt(0) != '.')
            {
                tree[second.charAt(0)-'A'] = first.charAt(0)-'A';
            }
            if(third.charAt(0) != '.')
            {
                tree[third.charAt(0)-'A'] = first.charAt(0) - 'A';
            }
        }
        System.out.println("여기서 부터 출력 ::");
        for(int i=0; i<n; i++)
        {
            System.out.print(tree[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) throws IOException
    {
        new Main().start();
    }
    
}
