package TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		double N1;
		String A;
		Scanner S = new Scanner(System.in);
		
		System.out.println("###########################################");
		System.out.println("- Welcome to Temperature converter Program -");
		System.out.println("###########################################");
		System.out.println();
		System.out.println("Please Choose the temperature scale:");
		System.out.println();
		System.out.print("Enter:");
		System.out.println("\n1: C for Celecous\n2: K for Kevlin\n3: F for Fahrenheit\n");
		System.out.println();
		A = S.next();
		System.out.println();
		System.out.println("Enter the temperature: ");
		System.out.println();
		N1 = S.nextInt();
		System.out.println();
		
	
		switch(A)
		{
		case "C":
			System.out.println("The Tempreature in Kelvin is : " + (N1 + 273.15) + " K°");
			System.out.println("The Tempreature in Fahrenheit is : " + (1.8*N1 + 32) + " F°");
			if (N1>=30)
			System.out.print("HOT");
			else if (N1>=23)
				System.out.print("Warm");
			else if (N1>=14)
				System.out.print("Mild");
			else if (N1>=0)
				System.out.print("Cold");
			else
				System.out.print("Freezing");
			break;
		case "c":
			System.out.println("The Tempreature in Kelvin is : " + (N1 + 273.15) + " K°");
			System.out.println("The Tempreature in Fahrenheit is : " + (1.8*N1 + 32) + " F°");
			if (N1>=30)
			System.out.print("HOT");
			else if (N1>=23)
				System.out.print("Warm");
			else if (N1>=14)
				System.out.print("Mild");
			else if (N1>=0)
				System.out.print("Cold");
			else
				System.out.print("Freezing");
			break;
		case "K":
			System.out.println("The Tempreature in Celecous is :" + (N1 -273.15) + " C°");
			System.out.println("The Tempreature in Fahrenheit is :" + (1.8*(N1-273.15)+32) + " F°");
			if (N1>=303)
			System.out.print("HOT");
			else if (N1>=296)
				System.out.print("Warm");
			else if (N1>=287)
				System.out.print("Mild");
			else if (N1>=273)
				System.out.print("Cold");
			else
				System.out.print("Freezing");
			break;
		case "k":
			System.out.println("The Tempreature in Celecous is :" + (N1 -273.15) + " C°");
			System.out.println("The Tempreature in Fahrenheit is :" + (1.8*(N1-273.15)+32) + " F°");
			if (N1>=303)
			System.out.print("HOT");
			else if (N1>=296)
				System.out.print("Warm");
			else if (N1>=287)
				System.out.print("Mild");
			else if (N1>=273)
				System.out.print("Cold");
			else
				System.out.print("Freezing");
			break;
		case "F":
			System.out.println("The Tempreature in Celecous is : " + 5 *(N1 - 32.0) / 9.0 + " C°");
			System.out.println("The Tempreature in Kelvin is : " + ((5 *(N1 - 32.0) / 9.0) + (273)) + " K°");
			if (N1>=86)
			System.out.print("HOT");
			else if (N1>=73.4)
				System.out.print("Warm");
			else if (N1>=57.2)
				System.out.print("Mild");
			else if (N1>=32)
				System.out.print("Cold");
			else
				System.out.print("Freezing");
			break;
		case "f":
			System.out.println("The Tempreature in Celecous is : " + 5 *(N1 - 32.0) / 9.0 + " C°");
			System.out.println("The Tempreature in Kelvin is : " + ((5 *(N1 - 32.0) / 9.0) + (273)) + " K°");
			if (N1>=86)
			System.out.print("HOT");
			else if (N1>=73.4)
				System.out.print("Warm");
			else if (N1>=57.2)
				System.out.print("Mild");
			else if (N1>=32)
				System.out.print("Cold");
			else
				System.out.print("Freezing");
			break;
			
		default:
			System.out.print("Please Enter C or K or F (Caps only)");
					
		}

		

	}

}
