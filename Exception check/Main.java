import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
      try
      {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a);
      }
     catch(InputMismatchException e)
     {
       System.out.println("Input Mismatch Exception occurred");
     }
   }
}