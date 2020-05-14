
package pkg2805;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int treeNum, max=0,min=0,mid;
    private long length;
    private int[] tree;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        treeNum = Integer.parseInt(st.nextToken());
        // length = Integer.parseInt(st.nextToken());
        length = Long.parseLong(st.nextToken());
        tree = new int[treeNum];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<treeNum; i++)
        {
            tree[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, tree[i]);
        }
        mid = max / 2;
        changeMax(max, mid, min);
    }
    private void changeMax(long max,long mid,long min)
    {
       // System.out.println("max : " + max + " mid : " + mid + " min : " + min);
        long temp = check(mid);
        if(mid == max || mid == min)
        {
            System.out.println(mid);
            return ;
        }
        if(temp > length)
        {
            changeMax(max,(max+mid)/2,mid);
        }
        else if(temp < length)
        {
            changeMax(mid,(min+mid)/2,min);
        }
        else
        {
            //temp == length
            System.out.println(mid);
            return ;
        }
    }
    private long check(long heigth)
    {
        long total =0;
        for(int i=0; i<treeNum; i++)
        {
            if(tree[i] > heigth)
            {
                total += tree[i] - heigth;
            }
        }
        //System.out.println("total의 값 ::" + total);
        return total;
    }
    public static void main(String[] args) throws IOException
    {
        new Main().start();
    }
}
