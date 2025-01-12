//Program to calculte Maximum number of Handshakes
import java.util.*;
public class MaxHandShakes{

  //method of return type int to calculate total handshakes
  public static double handShakes(int number){
    //formula to calculate total handshakes
    double handShakes = (double)(number * ((number - 1)))/2;
    return handShakes;
  }
  // main function
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of students: ");
    //input number by user
    int students = input.nextInt();
    // function called to calculate total handshakes
    double handShakes = handShakes(students);
    System.out.println("Possible number of hand shakes = "+ handShakes);
  }
}