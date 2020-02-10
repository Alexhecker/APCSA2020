package Unit4;

//(c) A+ Computer Science

//www.apluscompsci.com

//Name - Alexander Hecker
//Date - 2/10/2020
//Class - APCSA
//Lab  - NumberVerifyRunner.java

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		int test, x;
		
		for (x=0; x<= 4; x++) {
			out.print("Enter a whole number :: ");
			test = keyboard.nextInt();
			
			System.out.println(test + " is odd :: " + NumberVerify.isOdd(test));
			System.out.println(test + " is even :: " + NumberVerify.isEven(test));
			System.out.println();
			
			
			test = 2000;
			System.out.println("Enter a whole number :: " + test);
			System.out.println(test + " is odd :: " + NumberVerify.isOdd(test));
			System.out.println(test + " is even :: " + NumberVerify.isEven(test));
			System.out.println();
			
			test = -99;
			System.out.println("Enter a whole number :: " + test);
			System.out.println(test + " is odd :: " + NumberVerify.isOdd(test));
			System.out.println(test + " is even :: " + NumberVerify.isEven(test));
			System.out.println();
			
			test = 1111;
			System.out.println("Enter a whole number :: " + test);
			System.out.println(test + " is odd :: " + NumberVerify.isOdd(test));
			System.out.println(test + " is even :: " + NumberVerify.isEven(test));
			System.out.println();
			
			test = -850;
			System.out.println("Enter a whole number :: " + test);
			System.out.println(test + " is odd :: " + NumberVerify.isOdd(test));
			System.out.println(test + " is even :: " + NumberVerify.isEven(test));
			System.out.println();
		}
		
	}
}
