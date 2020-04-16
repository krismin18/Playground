import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    s = s.replaceAll("[AaEeIiOoUu]", "");
	System.out.println(s);
  }
}