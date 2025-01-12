//Program to check for Largest and smallest of three numbers

import java.util.Scanner;

public class SmallestAndLargest {

  //method to find smallest and largest
  public static int[] findSmallestAndLargest(int number1, int number2, int number3)
  {
    int []arr=new  int[2];
	  arr[0]=Math.min(number1,Math.min(number2,number3));
	  arr[1]=Math.max(number1,Math.max(number2,number3));
	  return arr;
  }
  
  //Main method
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
      //Take three no. from user
    System.out.print("Enter First number: ");
    int number1 = input.nextInt();
      
    System.out.print("Enter Second number: ");
    int number2 = input.nextInt();
    
    System.out.print("Enter Third number: ");
    int number3 = input.nextInt();

    int arr[] = SmallestAndLargest.findSmallestAndLargest(number1, number2, number3);

    System.out.println();
    System.out.println("Smallest Number is: " +arr[0]);
    System.out.println("Largest Number is : " +arr[1]);
  }
}
    
