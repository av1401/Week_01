//program for unit coversions

import java.util.Scanner;

public class UnitConvertor5{
	public static double convertYardsToFeet(double yards) {
        return yards * 3; // 1 yard = 3 feet
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        return feet / 3; //1 foot = 1/3 yard
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701; //1 meter = 39.3701 inches
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254; //1 inch = 0.0254 meters
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54; //1 inch = 2.54 centimeters
    }

    public static void main(String[] args) {

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        //Take inputs from user and then do the conversions

        // Convert yards to feet
        System.out.print("Enter the distance in Yards: ");
        double yards = sc.nextDouble();
        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");

        // Convert feet to yards
        System.out.print("Enter the distance in Feets: ");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");

        // Convert meters to inches
        System.out.print("Enter the distance in Meters: ");
        double meters = sc.nextDouble();
        System.out.println(meters + " meter = " + convertMetersToInches(meters) + " inches");

        // Convert inches to meters
        System.out.print("Enter the distance in Inches: ");
        double inches = sc.nextDouble();
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");

        // Convert inches to centimeters
        System.out.print("Enter the distance in Inches: ");
        double inchesForCm = sc.nextDouble();
        System.out.println(inchesForCm + " inches = " + convertInchesToCentimeters(inchesForCm) + " centimeters");
    }
}