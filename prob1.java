import java.util.*;
public class prob1 {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string of your choice:");
        String str1 = input.next();
        System.out.println("You entered: " + str1);
        str1 = str1.trim();
        char [] arr = str1.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        String str2 = new String (arr) ;
        System.out.println("Reverse of the string is" + " " + str2);

        if (str1.equalsIgnoreCase(str2))
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");

    }
}