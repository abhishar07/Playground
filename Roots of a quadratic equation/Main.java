import java.util.Scanner;
import java.lang.Math;
class Main
{
public static void main(String args[])
{
  Scanner in = new Scanner(System.in);
  float a  = in.nextFloat();
  float b = in.nextFloat();
  float c = in.nextFloat();
  double r1, r2, real, img, deter;
  deter = (b*b) - (4 * a * c);
  
  if(deter > 0)
  {
    r1 = (-b + Math.sqrt(deter))/(2*a);
    r2 = (-b - Math.sqrt(deter))/(2*a);
    
    System.out.printf("root1 = %.2f  root2 = %.2f",r1,r2);
  }
  else if(deter == 0)
  {
    r1=r2 = (-b/(2*a));
    System.out.printf("root1 = %.2f  root2 = %.2f",r1,r2);
  }
  else
  {
    real = (-b / (2*a));
    img = Math.sqrt(-deter)/(2*a);
    System.out.printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",real,img,real,img);
  }
}
}
