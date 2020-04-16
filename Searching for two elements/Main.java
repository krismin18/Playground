import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
       
        int arr_s = in.nextInt();
        int arr[] = new int[arr_s];
       
        for(int i = 0; i <= arr_s - 1; i++)
        {
            arr[i] = in.nextInt();
        }
               int s_1 = in.nextInt();
        
        int s_2 = in.nextInt();
       
        int e1_i = -1;
        int e2_i = -1;
      
        for(int i = 0; i <= arr_s - 1; i++)
        {
            if(s_1 == arr[i])
            {
                e1_i = i;
            }
            if(s_2 == arr[i]){
                e2_i = i;
            }
        }
        System.out.println(e1_i);
        System.out.println(e2_i);
    }
}