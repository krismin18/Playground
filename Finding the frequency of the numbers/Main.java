import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int i = 0; i <= n - 1; i++){
            a[i] = in.nextInt();
        }
        int freq[] = new int[k];
        for(int j = 0; j <= k - 1; j++)
        {
            freq[j] = 0;
        }
        for(int i = 0; i <= n - 1; i++){
           freq[a[i] - 1]++;
        }
        for(int i = 0; i <= k - 1; i++){
           System.out.println((i + 1) + " " + freq[i]);
        }
    }
}