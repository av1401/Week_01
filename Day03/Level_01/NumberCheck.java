 /*program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. 
 Further for positive numbers check if the number is even or odd.
 Finally compare the first and last elements of the array and display if they equal, greater or less
 */
 
 import java.util.*;
 public class NumberCheck{
	public static void main(String args[]){
	
		//Create Scanner object
		Scanner input = new Scanner(System.in);
		
		//Create a tell how many numbers to input
		int numbers= 5;
		
		//Create an array for taking input of numbers
		System.out.println("Enter the numbers:");
		
		int num[] = new int[5];
		
		//taking input from user
		for(int i=0;i<num.length;i++){
			num[i] = input.nextInt();
		}
		
		//Traversing through the array
		for(int i=0;i<5;i++){
		
			//checking whether the number is zero
			if(num[i]==0){
				System.out.println(num[i] + " is Zero");
			}
			//checking whether the number is negative
			else if(num[i]<0) System.out.println(num[i] + " is negative");
			
			//checking whether the number is positive
			else{
				if(num[i]%2==0) System.out.println(num[i] + " is even");   //checking whether the number is even
				else System.out.println(num[i] + " is odd");               //checking whether the number is odd
				
			}
		}
		//comparing first and last number
		if(num[0] > num[num.length-1]) System.out.println("First number is greater");
		else if(num[0] == num[num.length-1]) System.out.println("Both numbers are Equal");
		else System.out.println("second number is greater");
	}
 }