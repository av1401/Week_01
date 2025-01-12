//program for unit converesion

import java.util.Scanner;

public class UnitConvertor4{

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double kmTomiles = 0.621371;
        return km * kmTomiles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double milesTokm = 1.60934;
        return miles * milesTokm;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double metersTofeet = 3.28084;
        return meters * metersTofeet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feetTometers = 0.3048;
        return feet * feetTometers;
    }

	// Main function
    public static void main(String[] args) {
	
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for unit conversion
        System.out.print("Enter the distance in kilometers: ");
        double km = sc.nextDouble();
        double miles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");

        System.out.print("Enter the distance in Miles: ");
        double milesInput = sc.nextDouble();
        double kmResult = convertMilesToKm(milesInput);
        System.out.println(milesInput + " miles is equal to " + kmResult + " kilometers.");

        System.out.print("Enter the distance in Meters: ");
        double meters = sc.nextDouble();;
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feet + " feet.");

        System.out.print("Enter the distance in Feets: ");
        double feetInput = sc.nextDouble();;
        double metersResult = convertFeetToMeters(feetInput);
        System.out.println(feetInput + " feet is equal to " + metersResult + " meters.");
    }
}