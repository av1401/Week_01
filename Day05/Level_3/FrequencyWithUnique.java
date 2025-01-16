//program to find the frequency of characters in a string using unique characters

import java.util.*;

public class FrequencyWithUnique {
	//method to Find unique characters in a string using
    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueChars = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[index++] = current;
            }
        }

        char[] result = new char[index];
        System.arraycopy(uniqueChars, 0, result, 0, index);
        return result;
    }

    public static String[][] findFrequencyWithUnique(String text) {
        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char current = uniqueChars[i];
            int frequency = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == current) {
                    frequency++;
                }
            }
            result[i][0] = String.valueOf(current);
            result[i][1] = String.valueOf(frequency);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] result = findFrequencyWithUnique(input);
        System.out.println("Character - Frequency");
        for (String[] entry : result) {
            System.out.println(entry[0] + " - " + entry[1]);
        }
    }
}
