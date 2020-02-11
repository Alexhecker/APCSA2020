package Unit5;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Alexander Hecker
//Date - 2/11/2020
//Class - APCSA
//Lab  - StringEquality.java

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
		wordOne = "";
		wordTwo = "";
	}

	public StringEquality(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
		if (!wordOne.equals(wordTwo) || wordOne.compareTo(wordTwo) != 0)  {
		return false;
	}
		else {
			return true;
		}
	}

	public String toString()
	{
		if (checkEquality()) {
		return wordOne + " has the same letters as " + wordTwo + "\n";
	}
		else {
			return wordOne + " does not have the same letters as " + wordTwo + "\n";
		}
	}
}
