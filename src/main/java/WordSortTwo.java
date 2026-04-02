//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Aaron Jimenez

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo {
	private String[] wordRay;

	public WordSortTwo(String sentence) 
	{
		setList(sentence);
	}

	public void setList(String sentence) 
	{
		wordRay = sentence.split(" ");
		Arrays.sort(wordRay);
	}

	public void setWords(String sentence) 
	{
		wordRay = sentence.split(" ");
		Arrays.sort(wordRay);
	}

	public void sort() 
	{
		Arrays.sort(wordRay);
	}

	public String toString() 
	{
		String output = "";

		for (int i = 0; i < wordRay.length; i++)
		{
			output += "word " + i + " :: " + wordRay[i] + "\n";
		}
		return output;
	}
}