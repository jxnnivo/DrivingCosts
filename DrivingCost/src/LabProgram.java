/*
Author: Jennifer Vo
Course: COP 2210
Date: 06/02/2024
Assignment: Driving cost assignment
Instructor: Sergio Pisano
Description: Using Methods.
*/
import java.util.Scanner;

public class LabProgram {

	public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven ) {
		return (milesDriven * dollarsPerGallon) / milesPerGallon; // returns a double value
	}
	
   public static void main(String[] args) {
//     System.out.println(drivingCost(20.0, 3.1599, 50.0)); test for method dricingCost
	   Scanner scnr = new Scanner(System.in); // creates object for class Scanner
	   double milesPerGallon = scnr.nextDouble(); // takes user input for milesPerGallon
	   double dollarsPerGallon = scnr.nextDouble(); // takes user input for dollarsPerGallon
	   System.out.printf("%.2f ", drivingCost(milesPerGallon, dollarsPerGallon, 10)); // prints and calls drivingCost method with input variables and 10
	   System.out.printf("%.2f ", drivingCost(milesPerGallon, dollarsPerGallon, 50)); // prints and calls drivingCost method with input variables and 50
	   System.out.printf("%.2f\n", drivingCost(milesPerGallon, dollarsPerGallon, 400)); // prints and calls drivingCost method with input variables and 400
   }
}

/* CODE OUTPUT
20.0 3.1599
1.58 7.90 63.20 

*/