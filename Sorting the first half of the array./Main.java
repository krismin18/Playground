import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int index = 0;index < n; index++)
        {
            a[index] = in.nextInt();   
        }
        sort(n,a);
    }    
    public static void sort(int n,int a[])
    {
        for (int idx1 = 1; idx1 < n/2; idx1++) 
        {
            int key = a[idx1];
            int idx2 = idx1 - 1;
            while((idx2 >= 0) && (a[idx2] > key)) 
            {
                a[idx2 + 1] = a[idx2];
                idx2--;
            }
            a[idx2 + 1] = key;
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }
}