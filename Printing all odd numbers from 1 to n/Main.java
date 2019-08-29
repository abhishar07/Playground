import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count;
      for(count = 1 ; count <= n ; count = count + 1)
      {
        if ( count % 2 == 1)
          System.out.println(count);
      }
	}
}