//  program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
//Define class EligibleToVote for it
import java.util.*;
public class EligibleToVote{
	public static void main(String args[]){
		//Create Scanner object
		Scanner input = new Scanner(System.in);
		//Create a variable to initialize number of student
		int numberOfStudents = 10;
		//Create an array for taking input of age from user
		int age[] = new int[10];
		//taking input from user
		System.out.println(“Enter the age of 10 students one by one: ”)
		for(int i=0;i<age.length;i++){
			age[i] = input.nextInt();
		}
		//Display whether someone is eligible to vote
		for(int i=0;i<age.length;i++){
			if(age[i]<=0){
				System.out.println("Age cannot be negative : Invalid Age");
			}
			else if(age[i]>=18){
				System.out.println("The student with age " + age[i] + " can vote");
			}
			else{
				System.out.println("The student with age " + age[i] + " cannot vote");
			}
		}
	}
}
	