// Program to calculate Simple intrest 
import java.util.*;
public class SimpleInterest{

   //function of return type double to calculate Simple Interest
   public static double SI(double principle, double rate, double time){

      // formula to calculate simple interest
      double simpleInterest = (principle * rate * time) / 100;   
      return simpleInterest;
   }

   public static void main(String args[]){
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter Priciple");
      // input principle by user
      double principle = input.nextDouble();
      
      System.out.print("Enter rate of interest");
      // input rate of interest by user
      double rate = input.nextDouble();
   
   
      System.out.println("Enter Time");
      //input time by user
      double time = sc.nextDouble();
   
      // function called to calculate the simple interest
      double simpleInterest = SI(principle, rate, time);
      
      System.out.println(simpleInterest);
   }
}