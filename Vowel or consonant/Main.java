import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    char ch = in.next().charAt(0);
    if(ch == 'a' || ch == 'A')
    {
      System.out.println("Vowel");
    }
    else if(ch == 'e' || ch == 'E')
    {
      System.out.println("Vowel");
    }
    else if(ch == 'i' || ch == 'I')
    {
      System.out.println("Vowel");
    }
    else if(ch == 'o' || ch == 'O')
    {
      System.out.println("Vowel");
    }
    else if(ch == 'u' || ch == 'U')
    {
      System.out.println("Vowel");
    }
    else
      System.out.println("Consonant");
  }
}