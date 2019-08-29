import java.io.*;
import java.lang.*;
import java.util.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       TreeSet set = new TreeSet();
       String s = br.readLine();
       String [] arr = s.split(",");
       for(int i = 0;i < arr.length;i++)
       {
         set.add(arr[i]);
       }
      System.out.println(set);
      Object arr1[] = set.toArray();
      int n = arr1.length - 1;
      while(set.isEmpty()!= true)
      {
        Object m = arr1[n];
        set.remove(m);
        System.out.println(set);
        --n;
      }
      
    }
}