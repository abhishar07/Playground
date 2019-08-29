import java.util.Scanner;
class Main{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    if(n % 2 == 1)
    {
      int termsInSeries = (n+1)/2;
      int res = 2 * (termsInSeries - 1);
      System.out.println(res);
    }
    else
    {
      int termsInSeries = n/2;
      int res = termsInSeries - 1;
      System.out.println(res);
    }
  }
}