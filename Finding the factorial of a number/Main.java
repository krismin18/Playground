import java.util.Scanner;
class Main
{
   public static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int fact=1;  
  int number=in.nextInt();   
  fact = factorial(number);   
  System.out.println(fact);  
  }
}