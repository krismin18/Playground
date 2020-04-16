import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
     Scanner in = new Scanner(System.in);
    int n = in.nextInt();
   // int m = in.nextInt();
    for(int c=1;c<=n;c++)
    {
       System.out.print(c);
      if((c%3==0)&&(c!=n))
      {
        System.out.print(",");
      }
     
    }
  }
}