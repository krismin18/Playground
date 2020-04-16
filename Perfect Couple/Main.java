import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int a[] = new int[n];
       for(int i = 0; i <= n- 1; i++){
           a[i] = in.nextInt();
       }
       int val = in.nextInt();
       perfect_couple(n,a,val);
    }
   
    public static void perfect_couple(int n, int a[], int val)
    {
        for(int i1 = 0; i1 <= n - 1; i1++)
        {
            for(int i2 = i1 + 1; i2 <= n - 1; i2++)
            {
                int sum = a[i1] + a[i2];
                if(sum == val)
                {
                    System.out.println(a[i1] + "," + " " + a[i2]);
                }
            }
        }
    }
}