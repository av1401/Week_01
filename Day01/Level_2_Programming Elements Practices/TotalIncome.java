import java.util.*;
public class TotalIncome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Taking user input for salary and bonus
        System.out.print("Enter your salary: ");
        int salary = input.nextInt();
        System.out.print("Enter your bonus: ");
        int bonus = input.nextInt();
        // Calculating total income
        int totalIncome = salary + bonus;

        // Displaying the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence 	Total Income is INR " + totalIncome);
    }
}
