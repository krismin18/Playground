import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int[n];
      for(int i=0; i<= n-1; i++)
      {
        a[i]=in.nextInt();
      }
      subset(n,a);
    }
  public static void subset(int n , int a[])
  {
    for(int i1 = 0 ; i1 <= n-2 ; i1++)
    {
      for(int i2 = i1 + 1; i2 <= n-1 ; i2++)
      {
        for(int i3 = i2 + 1; i3 <= n-1 ; i3++)
        {
          System.out.print("(" + a[i1] + "," + " " + a[i2] + "," + " " + a[i3] + ")" + " ");
        }
      }
      System.out.println();
    }
  }
}