import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int str_len = str.length();
      int arr[] = new int[26];
      for(int i= 0;i <= 25;i++)
      {
        arr[i] = 0;
      }
      for(int i=0;i < str_len;i++)
      {
        if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
        {
          int offset = str.charAt(i) - 'a';
          arr[offset]++;
        }
        else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
        {
          int offset = str.charAt(i) - 'A';
          arr[offset]++;
        }
      }
      for(int i =0; i <=25;i++)
      {
        if(arr[i]==0)
        {
          char ch = (char)(i + 'a');
          System.out.print(ch+" ");
        }
      }
    }
}