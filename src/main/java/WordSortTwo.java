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

	public void setWords(String sentence) 
	{
		wordRay = sentence.split(sentence);
	}

	public void sort() 
	{
		Arrays.sort(wordRay);
	}

	public String toString() 
	{
		String output = "";
		return output + "\n\n";
	}
}