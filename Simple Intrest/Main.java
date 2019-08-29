import java.util.Scanner;
class Main{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    float p = in.nextFloat();
    float t = in.nextFloat();
    float r = in.nextFloat();
    float si;
    si = (p * r * t)/100;
    System.out.printf("%.6f",si);
  }
}