import java.util.Scanner;
import java.lang.Math;
class Main{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int i = 0, s = 0, r, p;
    int b[] = new int[32];
    int count = 0;
    while( n!= 0)
    {
      r = n % 10;
      p = (int)Math.pow(2,i);
      s = s + (p * r);
      i++;
      n = n/10;
    }
    
    while(s != 0)
    {
      b[count] = s % 8;
      s = s/8;
      count++;
    }
    for(int j = count - 1;j >= 0;j--)
    {
      System.out.print(b[j]);
    }
  }
}