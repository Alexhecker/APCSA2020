package Unit6;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Alexander Hecker

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover("I am Sam I am",'a');
		System.out.println(test.toString());
		
		test.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(test.toString());
		
		test.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(test.toString());
		
		test.setRemover("abababababa", 'b');
		System.out.println(test.toString());
		
		test.setRemover("abaababababa", 'x');
		System.out.println(test.toString());
											
	}
}
