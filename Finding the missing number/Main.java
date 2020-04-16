import java.util.Scanner;
class Main{
  public static void mis(int a[] , int n)
  {
    int i ,c=0,sum=n;
   // sum = (n * (n + 1))/2;
    for ( i = 0; i< n; i++) 
    {
      sum += i+1;
           c += a[i]; 
    }
    System.out.println((sum - c - 2));
  }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int a[] = new int[n];
      for(int i = 0; i < n; i++)
      {
        a[i] = in.nextInt();
      }
      mis(a,n);
    }
}