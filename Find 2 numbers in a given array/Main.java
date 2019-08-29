import java.util.Scanner;
class Main{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int arr[] = new int[size];
    int is_found1 = -1;
    int is_found2 = -1;
    for(int i = 0;i < size;i++)
    {
      arr[i] = in.nextInt();
    }
    int el1 = in.nextInt();
    int el2 = in.nextInt();
    for(int i = 0;i < size;i++)
    {
      if(arr[i] == el1)
      {
       is_found1 = i;
      }
      if(arr[i] == el2)
      {
        
        is_found2 = i;
      }
    }
      System.out.println("Element 1 index = "+is_found1);
      System.out.println("Element 2 index = "+is_found2);

  }
}