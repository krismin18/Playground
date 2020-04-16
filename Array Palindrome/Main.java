import java.util.Scanner;
class Main{
  public static int palindrome(int a[], int l, int r) 
{  
    if (l >= r) { 
        return 1; 
    } 
    if (a[l] == a[r])
    { 
        return palindrome(a, l + 1, r - 1); 
    } 
    else { 
        return 0; 
    } 
} 
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int a[] = new int[n];
       int l =0 ;
       int r = n-1;
      for(int i = 0; i < n; i++)
      {
        a[i] = in.nextInt();
      }
     if (palindrome(a, l, r) == 1) 
        System.out.print( "Yes"); 
    else
        System.out.println( "No"); 
    }
}