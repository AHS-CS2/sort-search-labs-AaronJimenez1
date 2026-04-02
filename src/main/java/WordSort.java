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
	   sort();
	}

	public void setList(String line)
	{
		wordRay = line.split(" ");
		sort();
	}

	public void sort()
	{
		Arrays.sort(wordRay, String.CASE_INSENSITIVE_ORDER);
	}

	public String toString()
	{
		String output = "";
		
		for (int i = 0; i < wordRay.length; i++)
		{
			output += "word " + i + " :: " + wordRay[i] + "\n";
		}
		return output + "\n";
	}
}