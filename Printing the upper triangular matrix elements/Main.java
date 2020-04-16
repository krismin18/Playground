import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int i, j;
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int[][] matrix = new int[row][col];
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                matrix[i][j] = in.nextInt();
            }
        }
        upper_matrix(row, col, matrix);
    }
    public static void upper_matrix(int row, int col, int[][] matrix)
    {
        int i, j, k;
        for(k = 0; k < col; k++)
        {
  	        for(i = 0, j = k; j < col ; i++, j++)
    	    System.out.print(matrix[i][j]+" ");
        }
    }
}