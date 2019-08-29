import java.util.Scanner;
class Main{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int t1 = 0;
    int t2 = 1;
    System.out.print(t1+" " + t2);
    for(int i = 3;i <= n; i++)
    {
      int next = t1 + t2;
      System.out.print(" " +next);
      t1 = t2;
      t2 = next;
    }
  }
}