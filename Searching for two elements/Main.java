import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
      int arr_size  = in.nextInt();
      int arr[] = new int[arr_size];
      for( int idx =0;idx <= arr_size -1;idx++)
      {
        arr[idx] = in.nextInt();
      }
      int search_elem_1 = in.nextInt();
      int search_elem_2 = in.nextInt();
      int index_1 = -1;
      int index_2 = -1;
      for(int idx = 0;idx <= arr_size -1;idx++)
      {
        if( search_elem_1 == arr[idx])
        {
          index_1 = idx;
        }
        if( search_elem_2 == arr[idx])
        {
          index_2 = idx;
        }
      }
      System.out.println(index_1);
      System.out.println(index_2);
      
        
        
    }
}