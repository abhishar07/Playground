import java.util.Scanner;
class Main{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    char ch = in.next().charAt(0);
    if(ch >= 'a' && ch <= 'z')
    {
      ch = (char)(ch-32);
    }
    else
      ch = (char)(ch + 32);
    
    System.out.println(ch);
  }
}