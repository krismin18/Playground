import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        int l = st.length();
        double a = 0;
        double b = 0;
        int flag =0;
        for(int i = 0; i<l; i++)
        {
            if(st.charAt(i)=='.')
            flag = 1;
        }
        if(flag == 1)
        {
            for (int i = l - 1 ; st.charAt(i)!= '.' && i >= 0; i--)
            {
                a = a/10 + (st.charAt(i)-'0');
            }
            a = a/10;
            for (int i = 0 ; st.charAt(i)!= '.' ; i++)
            {
                b = b*10 + (st.charAt(i)-'0');
            }
        }
        else
        {
            for (int i = 0 ; i<l ; i++)
            {
                b = b*10 + (st.charAt(i)-'0');
            }
        }
        double sum = (a + b);
        System.out.printf("%.6f",sum);
    }
}