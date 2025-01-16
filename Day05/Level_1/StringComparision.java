//program to compare two strings
import java.util.*;
public class StringComparision{
	
	public static boolean compareStrings(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		else{
			for(int i=0;i<str1.length();i++){
				if(str1.charAt(i) != str2.charAt(i)){
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String args[]){

		//Create scanner object
		Scanner sc = new Scanner(System.in);
		//Take input from user

		System.out.print("Enter first string: ");
		String str1 = sc.next();
		System.out.print("Enter Second string: ");
		String str2 = sc.next();

		//Calling method
		if(compareStrings(str1,str2)) System.out.println("These strings are equal, by by chartAt().");
		else System.out.println("These strings are not equal, by chartAt().");
		// using equal() method
		if(str1.equals(str2)) System.out.println("These strings are equal, by using equal() method.");
		else System.out.println("These strings are not equal, by using equal() method.");
	}
}