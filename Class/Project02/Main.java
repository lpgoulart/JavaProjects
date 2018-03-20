// Leonardo Goulart
// Java Programming language
// Project 02

import java.util.Scanner;

public class Main {
	static public void main ( String args[] ) {
		ProfInt p1 = new ProfInt ( "leo", 
									"1010",
									21,
									14503 );
		
		ProfHor p2 = new ProfHor ( "victor", 
									"1110",
									22,
									20,
									140 );
		ProfInt p3 = new ProfInt ( "arthur", 
									"1010",
									21,
									14500 );
		
		ProfHor p4 = new ProfHor ( "gustavo", 
									"1110",
									22,
									20,
									1400 );

		System.out.println ("Prof Integral and Prof Integral");
		SalaryDiff.Diff( p1, p3 );
		System.out.println ("Prof Integral and Prof Horista");
		SalaryDiff.Diff( p1, p2 );
		System.out.println ("Prof Horista and Prof Integral");
		SalaryDiff.Diff( p2, p3 );
		System.out.println ("Prof Horista and Prof Horista");
		SalaryDiff.Diff( p2, p4 );

	}
}