import java.util.Scanner;
class Main
{
  public static int sq(int num)
  {
    int n1 = (num * num);
    return n1;
    }
	public static void main (String[] args)
    {
	 Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int n2 = sq(n);
      System.out.println(n2);
	} 
}