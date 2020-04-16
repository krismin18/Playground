import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = in.nextInt();
        }
        int sum[] = new int[3 * n];
        sub_array(n, a, sum);
    }
    public static void sub_array(int n, int a[], int sum[])
    {
        for(int i1 = 0; i1 <= n - 1; i1++)
        {
            int key =  a[i1];
            for(int i2 = i1+1; i2 <= n-1; i2++)
            {       
                    if(a[i2]>key)
                    System.out.println(key+","+a[i2]+" ");
            }
        }
    }
}