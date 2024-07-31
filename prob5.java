import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class prob5 {
    public static void main(String []args){
        boolean b;
        String s = "";
        String output = "";
        do{
            System.out.println("Enter a string consists of only numbers:");
            Scanner input = new Scanner(System.in);
            s = input.nextLine();
            Pattern p = Pattern.compile("^\\d+$");
            Matcher m = p.matcher(s);
            b = m.matches();
        }
        while(!b);
        int num = Integer.parseInt(s);
        if (num <= 0 || num>= 3999){
            System.out.println("Invalid number. Please enter a number between 1 and 3999.");
        }
        else {
            while (num >= 1000){
                output += "M";
                num -= 1000;
            }
            while (num >= 500){
                output += "D";
                num -= 500;
            }
            while (num >= 100){
                output += "C";
                num -= 100;
            }
            while (num >= 50){
                output += "L";
                num -= 50;
            }
            while (num >= 10){
                output += "X";
                num -= 10;
            }
            while (num >= 9){
                output += "IX";
                num -= 9;
            }
            while (num >= 5){
                output += "V";
                num -= 5;
            }
            while (num >= 4){
                output += "IV";
                num -= 4;
            }
            while (num >= 1){
                output += "I";
                num -= 1;
            }
            System.out.println("Number you entered in Roman is :" + "  " + output);
        }


    }
}
