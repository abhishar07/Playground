import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
      for(int i = 2;i <= n;i++)
      {
        if(isPrime(i))
        {
          System.out.println(i);
        }
      }
          
	}
  public static boolean isPrime(int n)
  {
    boolean prime = true;
    for(int i = 2;i <= n/2;i++)
    {
      if(n % i == 0)
      {
        prime = false;
      }
     
    }
    return prime;
}
}