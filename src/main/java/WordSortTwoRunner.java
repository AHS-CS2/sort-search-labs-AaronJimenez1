//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Aaron Jimenez

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class WordSortTwoRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("src/main/java/wordsorttwo.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i<size; i++)
		{
			String sentence = file.nextLine();
			//instantiate a new WordSort

			WordSoirrTwo sen1 = new WordSortTwo("WHAT TIME IS IT?");
			WordSoirrTwo sen2 = new WordSortTwo("THE BIG BROWN FOX IS LAZY!");
			WordSoirrTwo sen3 = new WordSortTwo("I AM SAM SAM I AM SAM IS BIG");
			WordSoirrTwo sen4 = new WordSortTwo("1234 ONE TWO 5678");
			WordSoirrTwo sen5 = new WordSortTwo("a b i j 1 2 3");

			System.out.println(sen1);
		}
	}
}