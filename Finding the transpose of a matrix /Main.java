import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int mat[][] = new int[r][c];
    int transpose[][] = new int[c][r];
    for(int i = 0; i < r;i++)
    {
      for(int j= 0; j < c;j++)
      {
        mat[i][j] = in.nextInt();
      }
    }
      
      for(int i = 0; i < r;i++)
    {
      for(int j= 0; j < c;j++)
      {
        transpose[j][i] = mat[i][j];
      }
    }
    
    for(int i = 0; i < c;i++)
    {
      for(int j= 0; j < r;j++)
      {
        System.out.print(transpose[i][j]+ " ");
      }
      System.out.println();
  }
  
  
}
}