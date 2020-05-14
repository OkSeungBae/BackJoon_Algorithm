
package pkg6679;

public class Main {

    private int num;
    private int total12=0, total10=0, total16=0;
    public void start()
    {
        StringBuilder sb = new StringBuilder();
        for(int i=1000; i<10000; i++)
        {
            total12 = check12(i);
            total10 = check10(i);
            total16 = check16(i);
            if(total12 == total16 && total16 == total10)
                sb.append(i + "\n");
        }
        System.out.print(sb);
    }
    private int check16(int n)
    {
        String tempNum = Integer.toHexString(n);
        int sum = 0;
        for(int i=0; i<tempNum.length(); i++)
        {
            if(tempNum.charAt(i)  <= '9' && '0' <= tempNum.charAt(i))
            {
                sum += (tempNum.charAt(i)-'0');
            }
            else
            {
                sum += (tempNum.charAt(i) - 87);
            }
        }
        return sum;
    }
    private int check10(int n)
    {
        String tempNum = String.valueOf(n);
        int sum = 0;
        for(int i=0; i<4; i++)
        {
            sum += (tempNum.charAt(i)-'0');
        }
        return sum;
    }
    private int check12(int n)
    {
        int temp = n;
        int sum = 0;
        while(true)
        {
            sum += (temp % 12);
            temp = temp / 12;
            if(temp < 12)
            {
                sum += temp;
                break;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        new Main().start();
    }
}
