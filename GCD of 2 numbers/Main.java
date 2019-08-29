import java.util.Scanner;
class Main{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    int small = n1 < n2 ? n1 : n2;
    for(int i = small; i >= 0;i--)
    {
      if((n1 % i == 0) && (n2 % i == 0))
      {
        System.out.println(i);
        break;
      }
    }
  }
}