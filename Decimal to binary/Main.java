import java.util.Scanner;
class Main{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int b[] = new int[32];
    int cnt = 0;
    while(n != 0)
    {
      b[cnt] = n%2;
      n = n/2;
      cnt++;
    }
    for(int i = cnt -1;i >= 0;i--)
    {
      System.out.print(b[i]);
    }
  }
}