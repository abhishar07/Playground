import java.util.Scanner;
class Main{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int expo = in.nextInt();
    int res = power(base, expo);
    System.out.println(res);
  }
  public static int power(int a, int b)
  {
    int p = 1;
    for(int i = 1;i <= b;i++)
    {
      p = p * a;
    }
    return p;
  }
}