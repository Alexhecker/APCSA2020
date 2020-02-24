package Unit8;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Alexander Hecker
//Date - 2/24/2020

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		//boolean to int since the output of the code is supposed
		//to be the difference between two numbers (an integer).
		
		for (int i = 0; i<ray.length;i++)
		{
			if (ray[i]%2 != 0)
			{
				for (int j = i; j<ray.length;j++)
				{
					if (ray[j]%2 == 0)
					{
						return j - i;
					}
				}
			}
		}
		
		return -1;
	}
}
