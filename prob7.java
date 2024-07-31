import java.util.*;
public class prob7 {
    public static void main(String [] args){
        System.out.println("Enter three words:");
        Scanner input = new Scanner(System.in);
        String [] foundPrefix = new String[3];
        for (int i =0; i< foundPrefix.length; i++){
            System.out.print("Enter" + " " + (i + 1) + " " + "word " +  ": ");
            foundPrefix[i] = input.nextLine();
        }
        System.out.println("The words you entered: ");
        for (int i =0; i< foundPrefix.length; i++){
            System.out.println(foundPrefix[i]);
        }
        int min = foundPrefix[0].length();
        for (int i = 0; i < foundPrefix.length; i++){
            if (foundPrefix[i].length() < min){
                min = foundPrefix[i].length();
            }
        }
        String result = "";
        for(int i = 0; i < min ; i++){
            char c = foundPrefix[0].charAt(i);
            for (int j = 0; j < foundPrefix.length; j++){
                if (foundPrefix[j].charAt(i) != c){
                    result =String.valueOf(result.isEmpty());
                }
            }
            result += c;
        }
        System.out.println("The longest prefix is" + " " + result);
    }
}
