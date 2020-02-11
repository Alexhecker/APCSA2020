package Unit5;

//(c) A+ Computer Science

//www.apluscompsci.com

//Name - Alexander Hecker
//Date - 2/11/2020
//Class - APCSA
//Lab  - StringEqualityRunner.java

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality equalTest = new StringEquality();
		
		equalTest.setWords("hello", "goodbye");
		System.out.println(equalTest.toString());
		
		equalTest.setWords("one", "two");
		System.out.println(equalTest.toString());
		
		equalTest.setWords("three", "four");
		System.out.println(equalTest.toString());
		
		equalTest.setWords("TCEA", "UIL");
		System.out.println(equalTest.toString());
		
		equalTest.setWords("State", "Champions");
		System.out.println(equalTest.toString());
		
		equalTest.setWords("ABC", "ABC");
		System.out.println(equalTest.toString());
		
		equalTest.setWords("ABC", "CBA");
		System.out.println(equalTest.toString());
		
		equalTest.setWords("Same", "Same");
		System.out.println(equalTest.toString());
		
	}
}
