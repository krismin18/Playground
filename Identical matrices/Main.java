import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int flag = 0;
        int row = in.nextInt();
        int col = in.nextInt();
        int a[][] = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                a[i][j] = in.nextInt();
            }
        }
        int b[][] = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                b[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(a[i][j] != b[i][j])
                {
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0)
        System.out.print("Yes");
        else
         System.out.print("No");
    }
}