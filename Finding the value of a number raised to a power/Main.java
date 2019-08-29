import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exponent = in.nextInt();
      int power = 1;
      int expoCount = 1;
      while(expoCount <= exponent)
      {
        power *= base;
        expoCount++;
      }
      System.out.print(power);
    }
}
