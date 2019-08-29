import java.util.Scanner;

class Faculty
{
  public void salary(int baseSal)
  {
    System.out.println("Base Salary: " + baseSal);
  }
}
class CSE extends Faculty
{
  public void salary(int baseSal)
  {
    System.out.println("CSE Faculty: " +(baseSal + 3000));
  }
}
class IT extends Faculty
{
  public void salary(int baseSal)
  {
    System.out.println("IT Faculty: " +(baseSal + 5000));
  }
}
class ECE extends Faculty
{
  public void salary(int baseSal)
  {
    System.out.println("ECE Faculty: " + (baseSal + 4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int baseSal = in.nextInt();
    if(baseSal > 0)
    {
      Faculty obj1 = new Faculty();
      obj1.salary(baseSal);
      CSE obj2 = new CSE();
      obj2.salary(baseSal);
      IT obj3 = new IT();
      obj3.salary(baseSal);
      ECE obj4 = new ECE();
      obj4.salary(baseSal);
    }
    else
    {
      System.out.println("Null");
    }
  }
}