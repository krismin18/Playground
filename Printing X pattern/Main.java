import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
     
   Scanner in = new Scanner(System.in);
      int n = in.nextInt();
        //int count = n * 2 - 1;
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n; j++)
        {
            if(j==i || (j==n - i + 1))
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }

        System.out.print("\n");
    }
	}
}