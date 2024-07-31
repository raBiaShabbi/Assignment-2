import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class prob4 {
    public static void main(String []args){
        System.out.println("Enter date in(YYYY-MM-DD):");
        Scanner input = new Scanner(System.in);
        String date = input.nextLine();
        LocalDate _date = LocalDate.parse(date);
        LocalDate newDate = _date.plusDays(30);
        DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd-MM-yy");
        date = newDate.format(formate);
        System.out.println("New Date (dd-MM-yy): " + date);
    }
}