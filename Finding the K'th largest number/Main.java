import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i = 0; i <= n - 1; i++){
            a[i] = in.nextInt();
        }
        int k = in.nextInt();
        sort(n, a);
        System.out.println(a[n-k]);
    }
    public static void sort(int n, int a[]){
        for(int si = 0; si <= n - 2; si++)
        {
            int min_idx = find_min(si, a, n-1);
            swap(si, min_idx, a);
        }
    }
     public static void swap(int si, int min_idx, int a[]){
         int temp = a[si];
         a[si] = a[min_idx];
         a[min_idx] = temp;
     }
     public static int find_min(int si, int a[], int end){
         int min_idx = 0;
         if(a[si] < a[si + 1])
         {
             min_idx = si;
         }
         else{
             min_idx = si + 1;
         }
         for(int i = si + 2; i <= end; i++){
             if(a[min_idx] > a[i])
             {
                 min_idx = i;
             }
         }
         return min_idx;
     }
}