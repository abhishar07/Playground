import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       LinkedHashSet set = new LinkedHashSet();
       String s = br.readLine();
       String [] arr = s.split(",");
       for(int i = 0;i < arr.length;i++)
       {
         set.add(arr[i]);
       }
      System.out.println(set);
      System.out.print("Enter the value to be deleted: ");
      String s1 = br.readLine();
      System.out.println(s1);
      set.remove(s1);
      System.out.println(set);
      System.out.print("Enter the value to be added: ");
      String s2 = br.readLine();
      System.out.println(s2);
      set.add(s2);
      System.out.println(set);
    }
}