package Unit11;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Alexander Hecker

import java.util.Scanner;
import static java.lang.System.*;

public class WordPrinterRunner
{
	public static void main( String args[] )
	{
   	Scanner keyboard = new Scanner(System.in);
   	String choice="";
		do{
			
			
			String helloWord = ("hello");
			out.println("\nEnter the word to display :: " + helloWord);
			int helloTimes = 9;
			out.println("Enter the times to display :: " + helloTimes);
			WordPrinter.printWord(helloWord, helloTimes);
			
			
			String funnyWord = ("funny");
			out.println("\nEnter the word to display :: " + funnyWord);
			int funnyTimes = 6;
			out.println("Enter the times to display :: " + funnyTimes);
			WordPrinter.printWord(funnyWord, funnyTimes);
			
			
			String chickenWord = ("chicken");
			out.println("\nEnter the word to display :: " + chickenWord);
			int chickenTimes = 4;
			out.println("Enter the times to display :: " + chickenTimes);
			WordPrinter.printWord(chickenWord, chickenTimes);
			
			
			String dogWord = ("dog");
			out.println("\nEnter the word to display :: " + dogWord);
			int dogTimes = 1;
			out.println("Enter the times to display :: " + dogTimes);
			WordPrinter.printWord(dogWord, dogTimes);
			
			
			
			
			//user input
			out.print("\nEnter the word to display :: ");
			String Inputword = keyboard.next();
	
			out.print("Enter the times to display :: ");
 			int Inputtimes = keyboard.nextInt();			
			
 			WordPrinter.printWord(Inputword, Inputtimes);
			//called the printWord method

			System.out.print("\nDo you want to enter more sample input? ");
			choice=keyboard.next();			
		}while(choice.equals("Y")||choice.equals("y"));		
	}
}
