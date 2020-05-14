
package pkg14889;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    private int n;
    private int[][] startLink;
    private boolean[] team;
    private int gap = 100000;
    private int[] teamA, teamB;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        startLink = new int[n][n];
        team = new boolean[n];
        teamA = new int[n/2];
        teamB = new int[n/2];
        for(int i=0; i<n; i++)
        {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++)
            {
                startLink[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        divTeam(0);
        System.out.println(gap);
    }
    private void check()
    {
        int a=0,b=0;
        for(int i=0; i<n; i++)
        {
            if(team[i])
            {
                teamA[a] = i;
                a++;
            }
            else
            {
                teamB[b] = i;
                b++;
            }
        }
        int scoreA=0, scoreB=0;
        for(int i=0; i<teamA.length; i++)
        {
            for(int j=0; j<teamA.length; j++)
            {
                scoreA += startLink[teamA[i]][teamA[j]];
                scoreB += startLink[teamB[i]][teamB[j]];
            }
        }
        gap = Math.min(gap, Math.abs(scoreA - scoreB));
    }
    private void divTeam(int num)
    {
        if(num >= n)
        {
            int count=0;
            for(int i=0; i<n; i++)
            {
                if(team[i])
                    count++;
            }
            if(count == n/2)
                check();
            return ;
        }
        for(int i=0; i<2; i++)
        {
            if(i==0)
            {
                team[num] = true;
            }
            else
            {
                team[num] = false;
            }
            divTeam(num+1);
        }
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
