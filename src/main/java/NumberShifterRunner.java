//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Aaron Jimenez

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		int[] ray = NumberShifter.makeLucky7Array(20);
		System.out.println( Arrays.toString( ray ) );
		NumberShifter.shiftEm( ray );
		System.out.println( Arrays.toString( ray ) );
		System.out.println();
		int[] ray2 = NumberShifter.makeLucky7Array(20);
		System.out.println( Arrays.toString( ray2 ) );
		NumberShifter.shiftEm( ray2 );
		System.out.println( Arrays.toString( ray2 ) );
		System.out.println();
		int[] ray3 = NumberShifter.makeLucky7Array(20);
		System.out.println( Arrays.toString( ray3 ) );
		NumberShifter.shiftEm( ray3 );
		System.out.println( Arrays.toString( ray3 ) );
	}
}



