import java.util.Scanner;
class Main
{
  public static int Square(int n)
  {
    int sqr = n*n;
    return sqr;
  }
	public static void main (String[] args)
    {
	 Scanner in = new Scanner(System.in);
     int m = in.nextInt();
     int sqr1 = Square(m);
      System.out.println(sqr1);
      
	} 
}