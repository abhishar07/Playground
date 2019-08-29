import java.util.Scanner;
class Main{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    char array[] = str.toCharArray();
    int count = 0;
    for(char c : array)
    {
      count++;
    }
    System.out.println(count);
  }
}
