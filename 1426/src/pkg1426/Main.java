package pkg1426;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int n;
    private int[] cardNum;
    private char[] cardChar;
    private int[] cardCase;
    private Map<Character, Integer> hm;
    private char[] realNum;
    public void start() throws IOException
    {
        hm = new HashMap<Character, Integer>();
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        cardNum = new int[n];
        cardChar = new char[n];
        cardCase = new int[n];
        realNum = new char[n];
        for(int i=0;i<n;i++)
        {
            realNum[i] = '0';
        }
        //카드랑 카드뒷면 숫자 입력
        for(int i=0; i<n; i++)
        {
            st = new StringTokenizer(br.readLine());
            cardNum[i] = Integer.parseInt(st.nextToken());
            cardChar[i] = st.nextToken().charAt(0);
            hm.put(cardChar[i], cardNum[i]);
        }
        //카드통 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
        {
            cardCase[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cardChar);
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(hm.get(cardChar[i]) >= cardCase[j] && realNum[j] == '0')
                {
                    realNum[j] = cardChar[i];
                    break;
                }
            }
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(realNum[i]);
        }
    }
    public static void main(String[] args)  throws IOException{
        Main main = new Main();
        main.start();
    }
}
