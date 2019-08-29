import java.util.Scanner;
class Main{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    int n3 = in.nextInt();
    int n4 = in.nextInt();
    
    if(n1 < n2 && n1 < n3 && n1 < n4)
    {
      System.out.println(n1);
    }
    else if(n2 < n3 && n2 < n4)
    {
      System.out.println(n2);
    }
    else if(n3 < n4)
    {
      System.out.println(n3);
    }
    else
      System.out.println(n4);
  }
}