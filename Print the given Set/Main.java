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
    }
}