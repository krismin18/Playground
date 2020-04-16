import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner (System.in);
      int n = in.nextInt();
      int sum=0;
      for(int c=1;c<=n;c=c+1)
      {
        
        sum=sum+c;
        //n=n+1;
      
      }  System.out.println(sum);
	}
}