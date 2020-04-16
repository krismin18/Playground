import java.util.Scanner;
class Main{
 public static boolean rot(String st1, String st2) {  
        if (st1.length() != st2.length()) {  
            return false;  
        }  
        String st3 = st1 + st1;  
        if (st3.contains(st2))  
            return true;  
        else  
            return false;  
    }  
    public static void main(String args[])
    {
     	Scanner in = new Scanner(System.in);
      String st1 = in.nextLine();
      String st2 = in.nextLine();
      if (rot(st1, st2)) 
            System.out.println("Yes"); 
        else
            System.out.printf("No");
    }
}