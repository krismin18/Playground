import java.util.Scanner;
interface Notification
{
  void notificationBySms();
  void notificationByEmail();
   void notificationByCourier();
}
 class Details implements Notification
{
	public Details(String str , int ch)
    {
    System.out.print(str);
    	switch(ch)
        {
        	case 1:
            	notificationBySms();
                break;
                
              case 2:
              	notificationByEmail();
                break;
                
               case 3:
                 notificationByCourier();
                 break;
        }
    }
    public void notificationBySms()
    {
    	System.out.print("-Notification by SMS");
    }
    public void notificationByEmail()
    {
    	System.out.print("-Notification by Mail");
    }
    public void notificationByCourier()
    {
    	System.out.print("-Notification by Courier");
    }
}
public class Main
{
    public static void main(String args[])
    {
        //write your logic here
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int ch = sc.nextInt();
      Details d = new Details(str,ch);
    }
}