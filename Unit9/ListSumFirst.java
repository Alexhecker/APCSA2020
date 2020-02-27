package Unit9;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Alexander Hecker
//Date - 2/26/2020

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int sum = 0;
		boolean hey = false;
		for(int i = 0; i < ray.size(); i++) {
			if(ray.get(i) > ray.get(0)) {
				hey = true;
				sum += ray.get(i);
			}
		}
		return hey == true? sum:-1;
	}
}
