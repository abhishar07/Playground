import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int key = in.nextInt();
    StringBuilder sb = new StringBuilder(str);
    int str_len = sb.length();
    for(int i = 0; i < str_len;i++)
    {
      char ch = sb.charAt(i);
      if(ch >= 'a' && ch <= 'z')
      {
         ch = (char)(ch - key);
        if(ch < 'a')
        {
          ch = (char)(ch + 26);
        }
      }
      else if(ch >= 'A' && ch <= 'Z')
      {
        ch = (char)(ch - key);
        if(ch < 'A')
        {
          ch = (char)(ch + 26);
        }
      }
      sb.setCharAt(i,ch);
    }
    System.out.print(sb);
  }
}