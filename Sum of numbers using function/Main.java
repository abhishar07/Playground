import java.util.Scanner;
class Main{
  public static int sum_of_num(int num)
  {
    int i, sum = 0;
    for(i =1;i<=num;i++)
    {
      sum = sum +i;
    }
    return sum;
  }
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
          int n = in.nextInt();
      int sum1 = sum_of_num(n);
      System.out.println(sum1);
	}
}