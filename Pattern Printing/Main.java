import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        for(int i1 = 1; i1 <= row; i1++)
        {
            for(int i2 = col; i2 > col - i1 ; i2--)
            {
                System.out.print(i2);
            }
            for(int i2 = 1; i2 <= col - i1; i2++)
            {
                System.out.print(row - i1 + 1);
            }
            System.out.println();
        }
    }
}