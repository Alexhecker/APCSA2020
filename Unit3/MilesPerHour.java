package Unit3;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Alexander Hecker
//Date - 2/5/2020
//Class - APCSA
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
		
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist,hrs,mins);
		mph = 0.0;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		double seconds = (hours * 60) + minutes;
		mph = 60 * distance / seconds;
		
	}

	private static void MilesPerHour(int distance2, int hours2, int minutes2) {
		// TODO Auto-generated method stub
		
	}

	public void print()
	{
		System.out.println((distance + " miles in " + hours + " hours and " + minutes + " minutes = " + Math.round(mph) + " MPH"));
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		
		//return(distance + " miles in " + hours + " hour and  " + minutes + " minutes = " +  finalMPH + " MPH.\n\n");
		return Integer.toString((int)Math.round(mph));
	}
	
}
