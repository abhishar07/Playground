import java.util.Scanner;
class Main{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    float c = in.nextInt();
    float f = ((9*c)/5) + 32;
    System.out.printf("%.2f",f);
  }
}