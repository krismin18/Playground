import java.util.Scanner;
class Main{
  public static int great(int n,int n1,int n2)
  {  int result;
   if(n > n1)
   {
     //System.out.println(n);
     result = n;
   }
    else
   {
    // System.out.println(n2);
      result=n1;
   }
    if(result>n2)
    {System.out.println(result);}
   else
   { System.out.println(n2);}
    return result;
  }
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int m = in.nextInt();
       int m1 = in.nextInt();
      int m2 = in.nextInt();
      int ans=great(m,m1,m2);
      //System.out.println(ans);
    }
}