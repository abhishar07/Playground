import java.util.Scanner;
import java.lang.Math;
class Main{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    
    if(n % 2 == 1)
    {
      int term_in_series = (n+1)/2;
      int res = (int)Math.pow(2, term_in_series-1);
      System.out.println(res);
    }
    else
    {
      int term_in_series = n/2;
      int res = (int)Math.pow(3, term_in_series-1);
      System.out.println(res);
    }
  }
}