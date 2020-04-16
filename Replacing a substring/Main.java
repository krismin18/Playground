import java.util.Scanner;
class Main{
 
 public static void main(String[] args) 
  { 
        Scanner in = new Scanner(System.in);
        String st1 = in.nextLine();
        String st2 = in.nextLine();
        String st3 = in.nextLine();
        StringBuilder sb1 = new StringBuilder(st1);
        StringBuilder sb2 = new StringBuilder(st2);
        StringBuilder sb3 = new StringBuilder(st3);
        StringBuilder t = new StringBuilder("");
        int sb1_len = sb1.length();
        int sb2_len = sb2.length();
        int sb3_len = sb3.length();
   		int i, j;
        for(i = 0; i <= (sb1_len - 1) - (sb2_len - 1); i++)
        {
            boolean is_matching = true;
            for(j = 0; j < sb2_len; j++)
            {
                if(sb1.charAt(i + j) != sb2.charAt(j))
                {
                    is_matching = false;
                }
            }
            if(is_matching == true)
            {
              String strng = sb3.substring(0, sb3_len);
              t.append(strng);
              i = i + (sb2_len - 1);
            }
            else
            {
                char ch = sb1.charAt(i);
                t.append(ch);
            }
        }
        for(j = i ; j <= (sb1_len - 1); j++)
        {
                char ch = sb1.charAt(j);
                t.append(ch);
        }
        System.out.print(t);
    }
}