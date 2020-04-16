
import java.util.Scanner; 
class Main 
{ 
	static int frequent(int a[], int n, int freq[]) 
	{ 
	    int max_count_idx = 0; 
		int curr_count = 1; 
		
	    for(int i = 0; i < n; i++)
	    {
		    for (int j = i+1; j < n; j++) 
		    { 
	            if(a[i] == a[j])
	            curr_count ++;
		    }
		    freq[i] = curr_count;
		    curr_count = 1;
	    } 
	    for( int i = 0; i < n; i++)
	    {
            if(freq[i]>freq[max_count_idx])
            max_count_idx = i;
	    }
	    return a[max_count_idx];
	}
	public static void main (String[] args) 
	{ 
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = in.nextInt();
        }
        int freq[] = new int[n];
		System.out.println(frequent(a,n,freq)); 
	} 
}