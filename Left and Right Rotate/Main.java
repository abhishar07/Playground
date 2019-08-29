import java.util.Scanner;
class Main 
{
  public static void left_rotate(int n, int arr[],int rotation)
  {
    int first_even_element = 1;
    int last_even_element;
    if(n % 2 == 0)
    {
      last_even_element = n-1;
    }
    else
    {
      last_even_element = n-2;
    }
    
    for(int rotate =1;rotate <= rotation;rotate++)
    {
      int temp = arr[first_even_element];
      for(int i =3 ;i < n;i = i+2)
      {
        arr[i-2] = arr[i];
      }
      arr[last_even_element] = temp;
    }
  }
  public static void right_rotate(int n, int arr[], int rotation)
  {
    int first_odd_element = 0;
    int last_odd_element;
    if(n % 2 == 1)
    {
      last_odd_element = n - 1;
    }
    else
    {
      last_odd_element = n - 2;
    }
    for(int rotate =1;rotate <= rotation;rotate++)
    {
      int temp = arr[last_odd_element];
      for(int i =(last_odd_element-2);i >= 0;i = i-2)
      {
        arr[i+2] = arr[i];
      }
      arr[first_odd_element] = temp;
    }
  }
    
     public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();;
       int arr[] = new int[n];
       for(int i = 0;i < n;i++)
       {
         arr[i] = in.nextInt();
       }
       int rotation = in.nextInt();
       right_rotate(n, arr, rotation);
       left_rotate(n, arr, rotation);
       for(int i =0;i < n;i++)
       {
         System.out.print(arr[i]+" ");
       }
     }
    	
  	}
