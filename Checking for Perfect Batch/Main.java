import java.util.Scanner;
class Main{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int list[] = new int[n];
       for(int i= 0; i < n; i++)
       {
           list[i] = in.nextInt();
       }
       batch(list, n);
  }

public static void batch(int list[], int n)
{
    boolean is_perfect = true;
    int b_s = list[0] + list[1] + list[2];
    for(int i = 3; i <= n-1 ; i = i + 3)
    {
         int curr_s = list[i] + list[i + 1] + list[i + 2];
         if(curr_s != b_s)
         {
           is_perfect = false;
         }
    }
    if(is_perfect== true)
       {
          System.out.println("Perfect Batch");
       }
    else
       {
           System.out.println("Not a Perfect Batch");
       }
 }
}
