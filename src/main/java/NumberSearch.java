//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Aaron Jimenez

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSearch {
	public static int getNextLargest(int[] numArray, int searchNum) {

		// Fill in this method.

		Arrays.sort(numArray);
		for (int i = 0; i < numArray.length; i++)
		{
			if (numArray[i] > searchNum)
			{
				return numArray[i];
			}
		}
		return -1;
	}
}