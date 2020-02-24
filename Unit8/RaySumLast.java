package Unit8;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Alexander Hecker
//Date - 2/25/2020

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum = 0;
		boolean hey = false;
		for(int i = 0; i < ray.length; i++) {
			if(ray[i] > ray[ray.length - 1]) {
				hey = true;
				sum += ray[i];
			}
		}
		return hey == true? sum:-1;
	}
}
