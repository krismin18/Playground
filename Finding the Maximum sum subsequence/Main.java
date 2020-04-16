import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[20];
        int i, j;
        for(i=0; i<n; i++)
        {
            a[i]=in.nextInt();
        }
        System.out.print(sub( a, n ) );
    }
    public static int sub( int a[], int n )
    {
        int running_sum, max_sum_sub, i;
  
 	    running_sum = a[0];
  	    max_sum_sub = a[0];
  	    for(i = 1; i < n; i++)
        {
            if(a[i] > a[i-1])
            {
                running_sum += a[i];
            }
            else 
            {
                running_sum = a[i];
            }
            if(running_sum > max_sum_sub)
            {
                max_sum_sub = running_sum;
            }
        }
        return max_sum_sub;
    }
}

