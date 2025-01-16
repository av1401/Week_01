import java.util.*;

public class SubStrings {

    public static String subString(String string, int start, int end){
        String subString = "";
        for(int i=start;i<end;i++){
            subString += string.charAt(i);
        }
        return subString;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String for its substring: ");
        String string = sc.next();

        //Take starting and ending index
        int start = sc.nextInt();
        int end = sc.nextInt();

        //Calling substring subString method
        String subStrbycharAt = subString(string,start,end);
        System.out.println(subStrbycharAt);

        //doing it through built-in function
        String subStrbySubString = string.substring(start,end);
        System.out.println(subStrbySubString);

        //Comparing both strings
        if(subStrbycharAt.equals(subStrbySubString)) System.out.println("Substrings are same.");
        else System.out.println("SubStrings are not equal.");
    }
}
