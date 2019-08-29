import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int copyNumber = num;
      int digitCount = 0;
      int sum = 0;
      if(num == 0)
      {
        System.out.println(num);
      }
      else
      {
        while(num > 0)
        {
          num = num / 10;
          digitCount++;
        }
        num = copyNumber;
        int pow = 1;
        while(num > 0)
        {
          int rem = num % 10;
          for(int i = 1;i <= digitCount;i++)
          {
            pow = pow * rem;
          }
          sum = sum + pow;
          pow = 1;
          num = num / 10;
        }
        if(sum == copyNumber)
        {
          System.out.println("Armstrong Number");
        }
        else
        {
          System.out.println("Not a Armstrong Number");
        }
      }
	}
}