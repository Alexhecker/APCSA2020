package Unit6;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Alexander Hecker

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word test = new Word("Hello");
		out.println(test.toString());
		
		test.setString("World");
		out.println(test.toString());
		
		test.setString("JukeBox");
		out.println(test.toString());
		
		test.setString("TCEA");
		out.println(test.toString());
		
		test.setString("UIL");
		out.println(test.toString());
	}
}
