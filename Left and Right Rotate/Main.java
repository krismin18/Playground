import java.util.Scanner;
class Main 
{
    public static void rot(int n, int a[], int nr)
    {
       int fi = 1;
       int li;
       if(n % 2 == 0)
       {
           li = n - 1;
       }
       else
       {
           li = n - 2;
       }
       for(int r = 1; r <= nr; r++)
       {
           int temp = a[fi];
           for(int i = 3; i < n; i = i + 2)
           {
              a[i - 2] = a[i];
           }
           a[li] = temp;
       }
    }
    public static void rro(int n, int a[], int nr)
    {
       int fi = 0;
       int li;
       if(n % 2 == 1)
       {
          li = n - 1;
       }
       else
       {
          li = n - 2;
       }
       for(int r = 1; r <= nr; r++)
       {
           int temp = a[li];
           for(int i = (li - 2); i >= 0; i = i- 2)
            {
               a[i + 2] = a[i];
           }
           a[fi] = temp;
       }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int a[] = new int[n];
        for(int i = 0; i <= (n - 1); i++)
        {
            a[i] = in.nextInt();
        }
        int nr = in.nextInt();
        rot(n, a, nr);
        rro(n, a, nr);
    
    for(int i = 0; i <= (n - 1); i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}