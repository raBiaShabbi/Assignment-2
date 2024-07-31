import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class prob2 {
    public static void main(String []args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter umt email Id: ");
        String s1 = input.nextLine();
        System.out.println("You entered:" + " " + s1);
        Pattern p = Pattern.compile("^(F\\d{10}|[a-z]|[a-z]\\.[a-z])@umt\\.edu\\.pk$");
        Matcher m = p.matcher(s1);
        boolean b = m.matches();
        System.out.println("It is" + " " +b + " " + " umt email id.");
    }
}