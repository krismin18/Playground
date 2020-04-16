import java.util.Scanner;
class Main{
  public static int gc(int n,int n1,int n2)
  {  int min , gcd1=0 , gcd=0;
    if(n<n1)
      //System.out.println("min"+n);
    { min=n;}
    else
      //System.out.println("min"+n1);
    {min=n1;}
    while(min >= 1)
    {  
    if((n % min==0) && (n1 % min==0))
    {
      gcd1=min;
      break;
    }
        min--;
    }
   if(gcd1<n2)
    
    { min=gcd1;}
    else
      
    {min=n2;}
    while(min >= 1)
    {  
    if((gcd1 % min==0) && (n2 % min==0))
    {
      gcd=min;
      break;
    }
   
     min--;
    }
   return gcd;
    
  }
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int m = in.nextInt();
       int m1 = in.nextInt();
      int m2 = in.nextInt();
      int ans = gc(m,m1,m2);
      System.out.println(ans);
    }
}