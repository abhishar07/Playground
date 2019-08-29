import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        int n = Integer.parseInt(br.readLine());
        String key;
        String value;
        System.out.println("Enter the number of values to be inserted in map:"+ n);
        for(int i = 0;i < n;i++)
        {
          key = br.readLine();
          value = br.readLine();
          map.put(key, value);
        }
        System.out.println(map);
        String index = br.readLine();
        System.out.println("Enter the index to be removed:"+ index);
        map.remove(index);
        System.out.println(map);
        System.out.println("Size of map is : " + map.size());
      
     }
}