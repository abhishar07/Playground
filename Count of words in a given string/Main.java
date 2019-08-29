import java.util.Scanner;
class Main{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int str_len = str.length();
    int count = 1;
    for(int i = 0;i < str_len;i++)
    {
      if(str.charAt(i) == ' ')
      {
        count++;
      }
    }
    System.out.println(count);
  }
}