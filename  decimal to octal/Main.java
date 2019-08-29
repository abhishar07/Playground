import java.util.Scanner;
class Main{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int b[] = new int[32];
    int count = 0;
    while(n != 0)
    {
      b[count] = n % 8;
      n = n / 8;
      count++;
    }
    for(int i = count - 1;i >= 0;i--)
    {
      System.out.print(b[i]);
    }
  }
}