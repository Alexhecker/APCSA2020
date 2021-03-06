package Unit7;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Alexander Hecker

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		int counter = 0;
		for (int j = amount; j>0; j--)
		{
			char letterTemp = letter;
			
			for (int i = amount; i>0; i--)
			{
				int tempAmount = i;
				while (tempAmount > 0)
				{
					output += letterTemp;
					tempAmount--;
				}
				output += ' ';
				
				if (letterTemp == 'Z')
				{
						letterTemp = 'A';
				}
				else
				{
					letterTemp++;
					letterTemp = (char)letterTemp;
				}
				
				
				}
			output = output.substring(0, output.length() - (int)(1.5*counter + Math.pow(counter, 2)/2));
			counter++;
				
			output += "\n";
			
			}
		
		return output;
		}
	}
