//program to find the sum of n natural numbers using loop

import java.util.*;
public class Sum{
    // function to calculate sum of n natural numbers
    public static int sum(int number){
        int sum=0;
        for(int i=1;i<=number;i++){
            sum+=i;
        }
        return sum;
    }
    // main function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for sum: ");
        // take input number from user

        int number = input.nextInt();
        int sum = sum(number);
        
        //print statement
        System.out.println("Sum of "+number+" natural numbers is "+sum+".");
    }
}