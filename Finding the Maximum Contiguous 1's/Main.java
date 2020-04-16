import java.util.Scanner;
class Main
{
    public static void main(String args[])    
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = in.nextInt();
        }
        int freq[] = new int[n];
        int i = repeated_element(a,n,freq);
        int max = max_index(freq,n,i);
        System.out.print(max);
    }
    public static int repeated_element(int a[], int n, int freq[])
    {
        int i;
        int count=0;
        int freq_idx = 0;
        for(i = 0; i < n ; i++)
        {
            if(a[i] == 1)
            {
                count++;
            }
            if((a[i] == 0) || (i == n-1))
            {
                freq[freq_idx] = count;
                count = 0;
                freq_idx++;
            }
        }
        return freq_idx-1;
    }
    public static int max_index(int freq[], int n, int idx)
    {
        int max_no = 0;
        if((freq[0] > freq[1]) || (idx == 0))
        {
            max_no = freq[0];
        }
        else
        {
            max_no = freq[1];
        }
        for(int i = 2; i < idx ; i++)
        {
            if(max_no < freq[idx])
            { 
                max_no = freq[idx];
            }
        }
    return max_no;
    }
}