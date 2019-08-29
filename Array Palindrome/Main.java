import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int i = 0; i < arr_size; i++)
        {
          arr[i] = in.nextInt();
        }
        int front = 0;
        int end = arr_size - 1;
        int is_palindrone = 0;
      while(front < end)
      {
        is_palindrone = 0;
        if(arr[front] != arr[end])
        {
          is_palindrone = 1;
          break;
        }
        front++;
        end--;
      }
      if(is_palindrone == 1)
      {
        System.out.print("No");
      }
      else
      {
        System.out.print("Yes");
      }
    }
}