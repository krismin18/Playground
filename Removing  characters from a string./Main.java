import java.util.Scanner;
public class Main
{    
  	public static void main(String[] args) 
	{ 
	    Scanner in = new Scanner(System.in);
		String s = in.nextLine(); 
		String sub_s = in.nextLine(); 
		System.out.println(remov(s, sub_s)); 
	} 
	public static int[] array(String s) 
	{ 
	    int count[] = new int[256]; 
	    for (int i = 0; i<s.length(); i++) 
	    {
		    count[s.charAt(i)]++; 
	    }
	    return count; 
	} 
	public static String remov(String s, String sub_s) 
	{ 
	int count[] = array(sub_s); 
	int ip = 0, res = 0; 
		
	char arr[] = s.toCharArray(); 
		
	while (ip != arr.length) 
	{ 
		char temp = arr[ip]; 
		if(count[temp] == 0) 
		{ 
			arr[res] = arr[ip]; 
			res ++; 
		} 
			ip++; 
		
	}	 

	s = new String(arr); 
	return s.substring(0, res); 
	} 

	
}