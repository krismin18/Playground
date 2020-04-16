import java.util.Scanner;
class Main{
  public static int number(int num)
  {
    int sum=0;
    while(num!=0)
    {
      sum = sum + num;
      num = num - 1;
    }
    return sum;
  }
    
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int n1 = number(n);
      System.out.println(n1);
	}
}