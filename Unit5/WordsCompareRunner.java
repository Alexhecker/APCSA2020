package Unit5;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Alexander Hecker
//Date - 2/11/2020
//Class - APCSA
//Lab  - WordsCompareRunner.java

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		WordsCompare compareTest = new WordsCompare();
		
		compareTest.setWords("abe", "ape");
		System.out.println(compareTest.toString());
		
		compareTest.setWords("giraffe", "gorilla");
		System.out.println(compareTest.toString());
		
		compareTest.setWords("one", "two");
		System.out.println(compareTest.toString());
		
		compareTest.setWords("fun", "funny");
		System.out.println(compareTest.toString());
		
		compareTest.setWords("123", "19");
		System.out.println(compareTest.toString());
		
		compareTest.setWords("193", "1910");
		System.out.println(compareTest.toString());
		
		compareTest.setWords("goofy", "godfather");
		System.out.println(compareTest.toString());
		
		compareTest.setWords("funnel", "fun");
		System.out.println(compareTest.toString());

	}
}
