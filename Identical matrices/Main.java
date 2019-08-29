import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int row = in.nextInt();
    int col = in.nextInt();
    int mat1[][] = new int[row][col];
    int mat2[][] = new int[row][col];
    
    for(int i = 0;i < row;i++)
    {
      for(int j = 0;j < col;j++)
      {
        mat1[i][j] = in.nextInt();
      }
    }
    for(int i = 0;i < row;i++)
    {
      for(int j = 0;j < col;j++)
      {
        mat2[i][j] = in.nextInt();
      }
    }
    boolean is_identical = true;
    for(int i = 0;i < row;i++)
    {
      for(int j = 0;j < col;j++)
      {
        if(mat1[i][j] == mat2[i][j])
        {
          is_identical = true;
        }
        else
        {
          is_identical = false;
          break;
        }
      }
    }
    if(is_identical == true)
    {
      System.out.print("Yes");
    }
    else
      System.out.print("No");
      
          
  }
}