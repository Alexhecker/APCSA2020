package Unit3;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{

	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.calcMPH();
		test.print();
		
		
		dist = 96;
		hrs = 1;
		mins = 43;
		MilesPerHour output2 = new MilesPerHour(dist, hrs, mins);
		output2.calcMPH();
		output2.print();
		
		dist = 100;
		hrs = 2;
		mins = 25;
		MilesPerHour output3 = new MilesPerHour(dist, hrs, mins);
		output3.calcMPH();
		output3.print();
		
		dist = 50;
		hrs = 2;
		mins = 25;
		MilesPerHour output4 = new MilesPerHour(dist, hrs, mins);
		output4.calcMPH();
		output4.print();
		
		//add more test cases
		
		
	}
}
