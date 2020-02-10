package Unit4;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Alexander Hecker
//Date - 2/10/2020
//Class - APCSA
//Lab  - DiscountRunner.java

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		Discount bill = new Discount();
		System.out.println("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		System.out.println("Bill after discount :: " + String.format("%.2f\n\n", bill.getDiscountedBill(amt)));
		
		Discount bill1 = new Discount();
		double amt1 = 2500;
		System.out.println("Enter the original bill amount :: " + amt1 );
		System.out.println("Bill after discount :: " + String.format("%.2f\n\n", bill1.getDiscountedBill(amt1)));
		
		Discount bill2 = new Discount();
		double amt2 = 4000;
		System.out.println("Enter the original bill amount :: " + amt2 );
		System.out.println("Bill after discount :: " + String.format("%.2f\n\n", bill2.getDiscountedBill(amt2)));
		
		Discount bill3 = new Discount();
		double amt3 = 333.333;
		System.out.println("Enter the original bill amount :: " + amt3 );
		System.out.println("Bill after discount :: " + String.format("%.2f\n\n", bill3.getDiscountedBill(amt3)));
		
		Discount bill4 = new Discount();
		double amt4 = 95874.2154;
		System.out.println("Enter the original bill amount :: " + amt4 );
		System.out.println("Bill after discount :: " + String.format("%.2f\n\n", bill4.getDiscountedBill(amt4)));
		
	}
}
