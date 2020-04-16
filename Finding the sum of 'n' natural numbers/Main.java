import java.util.Scanner;
class Main {
  public static int addNumbers(int num) {
        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }
    public static void main(String[] args) 
    {
		Scanner in = new Scanner(System.in);
      int number = in.nextInt();
        int sum = addNumbers(number);
        System.out.println(sum);
    }
}
