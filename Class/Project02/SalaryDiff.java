// Leonardo Goulart
// Java Programming language
// Project 02

import java.util.Scanner;

public class SalaryDiff {
	public static void Diff (Prof p1, Prof p2) {
		
		if ( p1.salary() > p2.salary() ) {
			System.out.println ( p1.getName() );
			System.out.println ( p1.salary() );
		} else {
			System.out.println ( p2.getName() );
			System.out.println ( p2.salary() );
		}
	}
}