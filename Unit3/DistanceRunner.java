package Unit3;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Alexander Hecker
//Date - 2/6/2020
//Class - APCSA
//Lab  - U3_DistanceRunner

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		Distance PointsInput = new Distance();
		
		System.out.print("Enter X1 :: ");
		int x1 = keyboard.nextInt();
		System.out.print("Enter Y1 :: ");
		int y1 = keyboard.nextInt();
		System.out.print("Enter X2 :: ");
		int x2 = keyboard.nextInt();
		System.out.print("Enter Y2 :: ");
		int y2 = keyboard.nextInt();
		
		PointsInput.setCoordinates(x1, y1, x2, y2);
		PointsInput.calcDistance();
		out.println(PointsInput.toString());
		
		Distance Points1 = new Distance();
		x1 = 1;
		y1 = 1;
		x2 = 2;
		y2 = 1;
		
		System.out.println("Enter X1 :: " + x1);
		System.out.println("Enter Y1 :: " + y1);
		System.out.println("Enter X2 :: " + x2);
		System.out.println("Enter Y2 :: " + y2);
		
		
		Points1.setCoordinates(x1, y1, x2, y2);
		Points1.calcDistance();
		out.println(Points1.toString());
		
		Distance Points2 = new Distance();
		x1 = 1;
		y1 = 1;
		x2 = -2;
		y2 = 2;
		
		System.out.println("Enter X1 :: " + x1);
		System.out.println("Enter Y1 :: " + y1);
		System.out.println("Enter X2 :: " + x2);
		System.out.println("Enter Y2 :: " + y2);
		
		
		Points2.setCoordinates(x1, y1, x2, y2);
		Points2.calcDistance();
		out.println(Points2.toString());
		
		Distance Points3 = new Distance();
		x1 = 1;
		y1 = 1;
		x2 = 0;
		y2 = 0;
		
		System.out.println("Enter X1 :: " + x1);
		System.out.println("Enter Y1 :: " + y1);
		System.out.println("Enter X2 :: " + x2);
		System.out.println("Enter Y2 :: " + y2);
		
		
		Points3.setCoordinates(x1, y1, x2, y2);
		Points3.calcDistance();
		out.println(Points3.toString());
	}
}
