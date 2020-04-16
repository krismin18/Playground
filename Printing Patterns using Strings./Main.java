import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = s.length();
        int mid = n/2;
        for(int i = n-1; i >= 0 ; i--)
        {
            int count = 0;
            for(int k = 0;k < i; k++)
            {
            System.out.print(" ");
            count++;
            }
            if(i>=n/2)
            {
                int j = n/2; 
                while(count<n)
                {
                    System.out.print(s.charAt(j++));
                    count++;
                }
            }
            else
            {
                int j = n/2;
                while(count<=(n/2+i))
                {
                    System.out.print(s.charAt(j++));
                    count++;
                }
                j = 0;
                while(count < n)
                {
                    System.out.print(s.charAt(j++));
                    count++;
                }
            }
            System.out.println();
        }
    }
}
