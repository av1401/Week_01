import java.util.*;
public class KmToMiles2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble();
	// 1 km = 0.6 miles
        double miles = km * 0.62;
        System.out.print("The total miles is "+miles+" miles for the given Km" + km);
        input.close();
    }
}
