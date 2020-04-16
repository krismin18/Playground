import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int a[] = new int[n];
       for(int i = 0; i <= n - 1; i++){
           a[i] = in.nextInt();
       }
       
       end(n, a);
       for(int i = 0; i <= n - 1; i++){
           System.out.print(a[i] + " ");
       }
    }
    public static void end(int n, int a[])
    {
        int count = 0; 
        for(int i = 0; i <= n - 1; i++){
            if(a[i] != 0)
            {
                int temp = a[i];
                a[i] = a[count];
                a[count] = temp;
                count++;
            }
        }
    }
}