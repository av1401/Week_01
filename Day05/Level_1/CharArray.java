import java.util.*;

public class CharArray {

    // Method to return all characters in a string without using toCharArray()
    public static char[] charArray(String str) {
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        return ch;
    }

    // Method to compare two char arrays and return a boolean result
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String string = scanner.next();

        // Get characters using user-defined method
        char[] userDefinedChars =charArray(string);

        // Get characters using built-in toCharArray() method
        char[] builtInChars = string.toCharArray();

        // Compare the two char arrays
        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);

        // Display the result
        System.out.println("Characters using user-defined method: " + new String(userDefinedChars));
        System.out.println("Characters using built-in toCharArray(): " + new String(builtInChars));
        System.out.println("Both arrays are Equal " + areEqual);

    }
}
