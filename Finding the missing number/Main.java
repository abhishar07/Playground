import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
      for(int i =0; i < arr_size; i++)
      {
        arr[i] = in.nextInt();
      }
      int temp[] = new int[arr_size];
      for(int i = 0;i < arr_size;i++)
      {
        temp[i] = i+1;
      }
     for(int i = 0;i < arr_size;i++)
     {
       int count = 0;
       for(int j =0; j < arr_size;j++)
       {
         if(temp[i] == arr[j])
         {
           count++;
         }
       }
         if(count == 0)
         {
           System.out.print(temp[i]);
         }
       }
    }
}
