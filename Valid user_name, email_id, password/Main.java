import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
public class Main {
    private static Pattern userNamePtrn = Pattern.compile("^[a-zA-Z0-9_-]*$");
    public static boolean validateUserName(String username)
    {
       Matcher match = userNamePtrn.matcher(username);
      if(match.matches()){
        return true;
      }
      return false;
    }
    private static Pattern emailPatrn = Pattern.compile("^[a-z0-9@_.]*$");
    public static boolean validateEmail(String emailId)
    {
      Matcher match1 = emailPatrn.matcher(emailId);
      if(match1.matches()){
        return true;
      }
      return false;
    }
    private static Pattern passPatrn = Pattern.compile("^[a-zA-Z0-9@#$%]*$");
    public static boolean validatePassword(String pass)
    {
      Matcher match2 = passPatrn.matcher(pass);
      if(match2.matches()){
        return true;
      }
      return false;
    }
  public static void main(String a[]){
      Scanner in = new Scanner(System.in);
      String userName = in.nextLine();
      String email = in.nextLine();
      String password = in.nextLine();
      System.out.println("Is " + userName + " a valid user name? " + validateUserName(userName));
      System.out.println("Is " + email + " a valid email address? " + validateEmail(email));
      System.out.println("Is " + password + " a valid password? " + validatePassword(password));
  }
}