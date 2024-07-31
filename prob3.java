import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class prob3 {
    public static void main(String []args){
        LocalDate date = LocalDate.now();
        System.out.println("Current Date of the system is" + " " + date);
        DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd-MM-yy");
        String s = date.format(formate);
        System.out.println(s);
    }

}
