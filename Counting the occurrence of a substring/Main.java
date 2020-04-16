import java.util.Scanner;
class Main{
  public static int sub(String str , String st2)
  {
    int s1 = str.length();
    int s2 = st2.length();
    int res=0;
    for (int i = 0; i <= s1 - s2; i++) { 
            int j;             
            for (j = 0; j < s2; j++) { 
                if (str.charAt(i + j) != st2.charAt(j)) { 
                    break; 
                } 
            }  
            if (j == s2) {                 
                res++;                 
                j = 0;                 
            }             
        }         
        return res;
  }
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String st2 = in.nextLine();
    
    System.out.println(sub(str , st2));
      
    
  } 
}