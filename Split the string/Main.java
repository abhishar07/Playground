import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main{
    public static void main(String args[]){
          Scanner in = new Scanner(System.in);
          String str = in.nextLine();
          Pattern pattern = Pattern.compile("(,| |and|or)");
          String [] parts = pattern.split(str);
      for(String p : parts)
      {
          System.out.println(p);
      }
    }
}