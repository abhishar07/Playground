import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int copyNumber = n;
        int sum = 0;
        while(n > 0)
        {
          int rem = n % 10;
          int fact = 1;
          for(int i = 1;i <= rem;i++)
          {
            fact = fact * i;
          }
          sum = sum + fact;
          fact = 1;
          n = n/10;
        }
      if(sum == copyNumber)
      {
        System.out.println("Yes");
      }
      else
        System.out.println("No");
	}
}