import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       TreeMap<String, String> map = new TreeMap<String, String>();
       int n = Integer.parseInt(br.readLine());
       System.out.print("Enter the number of values to be inserted in map:");
       System.out.println(n);
       String name;
       String marks;
       for(int i = 0;i < n;i++)
       {
         name = br.readLine();
         marks = br.readLine();
         map.put(name, marks);
       }
      System.out.println(map);
      String n1 = br.readLine();
      System.out.println("Enter the index to be removed:"+ n1);
      map.remove(n1);
      System.out.println(map);
      String m1 = br.readLine();
      System.out.println("Enter the index to insert:"+ m1);
      String n2 = br.readLine();
      System.out.println("Enter the value to be inserted:"+ n2);
      map.put(m1,n2);
      System.out.println(map);
    }
}