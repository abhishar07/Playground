import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 1;
      for(int i = 1;i <= n;i++)
      {
        for(int space = 1;space <= n - i;space++)
        {
          System.out.print(" ");
        }
        for(int col = 1;col <= i;col++)
        {
          System.out.print(c+" ");
          c++;
        }
        System.out.println();
      }
    }    
}