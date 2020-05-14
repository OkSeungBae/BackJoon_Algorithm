
package pkg1963;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int testCase;
    private ArrayList<Integer> prime;
    private boolean flag = false;
    private boolean[] primeNum;
    private int[] answer;
    public void start() throws IOException
    {
        primeNum = new boolean[10000];
        answer = new int[10000];
        br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());
        prime = new ArrayList<Integer>();
        primeSet();
        for(int i=0; i<testCase; i++)
        {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            bfs(first, second);
            for(int j=0; j<10000; j++)
            {
                answer[j] = 0;
            }
        }
    }
    private void bfs(int first, int second)
    {
        answer[first] = 1;
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(first);
        int next=0;
        while(!q.isEmpty())
        {
            next = q.poll();
            if(next == second)
            {
                System.out.println(answer[second] - 1);
            }
            String temp = String.valueOf(next);
            int chun = (temp.charAt(0) - '0') * 1000;
            int back = (temp.charAt(1) - '0') * 100;
            int ship = (temp.charAt(2) - '0') * 10;
            int il = temp.charAt(3) - '0';
            for(int i=1; i<10; i++)
            {
                if(primeNum[next-chun + (i*1000)] && answer[next-chun + (i*1000)] == 0)
                {
                    answer[next-chun + (i*1000)] = answer[next] + 1;
                    q.add(next-chun + (i*1000));
                }
            }
            for(int i=0; i<10; i++)
            {
                if(primeNum[next-back + (i*100)] && answer[next-back + (i*100)] == 0)
                {
                    answer[next-back + (i*100)] = answer[next] + 1;
                    q.add(next-back + (i*100));
                }
            }
            for(int i=0; i<10; i++)
            {
                if(primeNum[next-ship + (i*10)] && answer[next-ship + (i*10)] == 0)
                {
                    answer[next - ship + (i*10)] = answer[next] + 1;
                    q.add(next - ship + (i*10));
                }
            }
            for(int i=0; i<10; i++)
            {
                if(primeNum[next-il + i] && answer[next-il + i] == 0)
                {
                    answer[next-il + i] = answer[next] + 1;
                    q.add(next - il + i);
                } 
            }
        }
        if(answer[second] == 0)
        {
            System.out.println("Impossible");
        }
    }
    private void primeSet()
    {
        for(int i=1000; i<10000; i++)
        {
            flag = false;
            for(int j=2; j<i; j++)
            {
                if(i%j == 0)
                {
                    flag = true;
                    break;
                }
            }
            if(!flag)
                prime.add(i);
        }
        for(int i=0; i<prime.size(); i++)
        {
            primeNum[prime.get(i)] = true;
        }
    }
    
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
