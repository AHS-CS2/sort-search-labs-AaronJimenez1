//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Aaron Jimenez

import java.util.Arrays;
import static java.lang.System.*;

public class WordSortRunner
{
	public static void main(String args[])
	{
		WordSort ws1 = new WordSort("abc ABC 12321 fred alexander");
		ws1.sort();
		System.out.println(ws1);
		WordSort ws2 = new WordSort("a zebra friendly acrobatics 435 TONER PRinTeR");
		ws2.sort();
		System.out.println(ws2);
		WordSort ws3 = new WordSort("b x 4 r s y $");
		ws3.sort();
		System.out.println(ws3);
		WordSort ws4 = new WordSort("123 ABC abc 034 dog cat sally sue 2a2");
		ws4.sort();
		System.out.println(ws4);

		//add test cases to test your WordSort Class
	}
}