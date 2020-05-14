
package pkg1251;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    private BufferedReader br;
    private String word;
    private int[] size;
    private ArrayList<String> answer;
    
    public void start() throws IOException
    {
        answer = new ArrayList<String>();
        br = new BufferedReader(new InputStreamReader(System.in));
        word = br.readLine();
        size = new int[3];
        check(word.length(), 0,0);
        Collections.sort(answer);
        System.out.println(answer.get(0));
    }
    private String change(int a, int b, int c)
    {
        StringBuilder result = new StringBuilder();
        for(int i=0; i<a; i++)
        {
            result.append(word.charAt(a-i-1));
        }
        for(int i=a; i<a+b; i++)
        {
            result.append(word.charAt(a+b+a-1-i));
        }
        for(int i=a+b; i<a+b+c; i++)
        {
            result.append(word.charAt(a+b+c+a+b-1-i));
        }
        return result.toString();
    }
    private void check(int wordLength, int currentLength, int index)
    {
        if(wordLength == currentLength && index == 3)
        {
            answer.add(change(size[0], size[1], size[2]));
            return ;
        }
        if(index >= 3)
        {
            return ;
        }
        for(int i=1; i<=wordLength-2; i++)
        {
            size[index] = i;
            check(wordLength, currentLength + i, index+1);
        }
    }
    public static void main(String[] args) throws IOException{
       new Main().start();
    }
}
