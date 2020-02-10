package Unit4;

//(c) A+ Computer Science

// Name - Alexander Hecker
// Date - 2/10/2020
// Class - APCSA 
// Lab - Discount.java



import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	//instance variables and constructors could be used, but are not really needed
	
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	public static double getDiscountedBill(double bill)
	{
		if (bill >= 2000) {
			return 0.85 * bill;
		} else {
			return bill;
		}
	}
}
