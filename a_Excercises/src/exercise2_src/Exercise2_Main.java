package exercise2_src;

import java.util.Scanner;

public class Exercise2_Main 
{

	public static void main(String[] args) 
	{
		// Part i - city information
		String sCity = "Dublin"; 
		int iPopulation = 1000000;
		String sLatitude = "59'67\"";
		String sLongitude = "60'98\"";
		int iAverageRainfall = 192;
		int iAverageSunshine = 240;
		
		System.out.println("Welcome to " + sCity + "The population is " + iPopulation + "Dublin is located at " + sLatitude + ", " + sLongitude + ".\n The average rainfall is " + iAverageRainfall +" and the average sunshine is " + iAverageSunshine + "\n Please enjoy your Stay!" );
		
		// Part ii - Radius of a circle
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Give me a number?");
		String sInput = scanner.nextLine();
		double dRadius = new Double(sInput);
		double dArea = (Math.PI * Math.pow(dRadius, 2));
		double dCircumference = 2*Math.PI*dRadius; 
		System.out.println("If you were a circle you'd cover " +  dArea + " m^2 and have a circumference of " + dCircumference + "m");
		

	}

}
