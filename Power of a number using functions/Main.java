import java.util.Scanner;
class Main{
  public static int power(int base,int exp)
  {  int temp=base;
    for(int i=1; i<exp; i++)
    {
      temp = temp * base;
    }
   return temp;
  }
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int b = in.nextInt();
       int ex = in.nextInt();
      int ans = power(b,ex);
      System.out.println(ans);
    }
}