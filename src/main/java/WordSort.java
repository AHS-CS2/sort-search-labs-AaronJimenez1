//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Aaron Jimenez

import java.util.Arrays;
import static java.lang.System.*; 

public class WordSort
{
	private String[] wordRay;

	public WordSort(String line)
	{
	   setList(line);
	}

	public void setList(String line)
	{
		wordRay = line.split(" ", wordRay.length);
	}

	public void sort()
	{
		Arrays.sort(wordRay);
	}

	public String toString()
	{
		String output="word " + " :: " + wordRay;
		return output+"\n\n";
	}
}