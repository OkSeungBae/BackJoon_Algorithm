
package pkg2635;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    private BufferedReader br;
    private int n;
    private ArrayList<Integer> list;
    private int maxSize=0;
    private ArrayList<Integer> answerList;
    public void start() throws IOException
    {
        list = new ArrayList<Integer>();
        answerList = new ArrayList<Integer>();
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());   
        for(int i=1; i<n+1; i++)
        {
            list.add(n);
            check(i);
            if(maxSize < list.size())
            {
                int temp = list.size();
                maxSize = temp;
                answerList.clear();
                for(int j=0; j<temp; j++)
                {
                    answerList.add(list.get(j));
                }
            }
            list.clear();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(maxSize + "\n");
        for(int i=0; i<maxSize; i++)
        {
            sb.append(answerList.get(i) + " ");
        }
        System.out.print(sb);
    }
    private void check(int n)
    {
        if(n<0)
            return ;
        list.add(n);
        int temp=list.size();
        check(list.get(temp-2) - list.get(temp-1));
        
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
