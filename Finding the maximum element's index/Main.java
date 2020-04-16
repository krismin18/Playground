import java.util.Scanner;
class Main{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int list[] = new int[n];
	int max = list[0];
		int index = 0;
	for(int i = 0; i < n; i++)
	{
		list[i] = in.nextInt();
	}
	
	for(int i = 0; i < n ; i++)
    {
		if (max < list[i]) 
			{
				max = list[i];
				index = i;
			}

	}
	System.out.println(index);

	}
}