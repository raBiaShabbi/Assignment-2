import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class prob6 {
    public static void main(String []args){
        System.out.println("Enter string consists of characters only: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        Pattern p = Pattern.compile("^\\s*(\\(\\)|\\{\\}|\\[\\])*\\s*$\n|^\\(\\)\\{\\}\\[\\]$");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        if(b == true){
            System.out.println(s + " " +"is valid.");
        }
        else{
            System.out.println(s + " " + "is invalid.");
        }

    }

}
