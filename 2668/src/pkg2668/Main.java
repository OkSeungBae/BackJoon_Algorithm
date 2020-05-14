package pkg2668;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
public class Main {

    private BufferedReader br;
    private int n;
    private int[] num, card;
    private int[] visit;
    private ArrayList<Integer> firstA, secondA, answerA,tempA;
    private int maxCount=0;
    private int count=0;
    public void start() throws IOException
    {
        firstA = new ArrayList<Integer>();
        secondA = new ArrayList<Integer>();
        answerA = new ArrayList<Integer>();
        tempA = new ArrayList<Integer>();
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        num = new int[n];
        card = new int[n];
        visit = new int[n];
        for(int i=0; i<n; i++)
        {
            num[i] = i+1;
            card[i] = Integer.parseInt(br.readLine());
        }
        recusion(n-1);
        System.out.println("카운트의 값 :");
        System.out.println(maxCount);
        System.out.println("답 :");
        for(int i=0; i<answerA.size(); i++)
        {
            System.out.print(answerA.get(i) + " ");
        }
    }
    private void check()
    {
        System.out.println("여기서 부터 visit출력::");
        for(int i=0; i<n; i++)
        {
            System.out.print(visit[i] + " ");
        }
        System.out.println();
        int numTotal=0;
        int cardTotal = 0;
        count=0;
        tempA.clear();
        firstA.clear();
        secondA.clear();
        for(int i=0; i<n; i++)
        {
            if(visit[i] == 1)
            {
                numTotal += num[i];
                cardTotal += card[i];
                firstA.add(num[i]);
                secondA.add(num[i]);
                tempA.add(num[i]);
                count++;
            }
        }
        if(numTotal == cardTotal)
        {
            System.out.println("둘의 값이 같아지는 순간 :: " + numTotal + "count :: " + count);
            if(maxCount < count)
            {
                Collections.sort(firstA);
                Collections.sort(secondA);
                for(int i=0; i<firstA.size(); i++)
                {
                    for(int j=0; j<secondA.size(); j++)
                    {
                        if(firstA.get(i) == secondA.get(j))
                        {
                            firstA.remove(i);
                            secondA.remove(j);
                        }
                    }
                }
                if(firstA.isEmpty() && secondA.isEmpty())
                {
                    System.out.println("여기들어감 시이바라발밥ㄹ");
                    answerA.clear();
                    for(int i=0; i<tempA.size(); i++)
                    {
                        answerA.add(tempA.get(i));
                    }
                }
            }
        }
    }
    private void recusion(int index)
    {
        if(index<0)
        {
            check();
            return ;
        }
        for(int i=0; i<2; i++)
        {
            visit[index] = i;
            recusion(index-1);
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
